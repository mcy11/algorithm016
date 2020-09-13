package pratice.week1.fourth;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 16:13
 */
public class DetectCycle {

    public ListNode detectCycle2(ListNode head) {

        ListNode fast = head.next;
        ListNode low = head;

        while (fast != null && fast.next != null){
            if(fast == low){
                break;
            }
            fast = fast.next.next;
            low = low.next;
        }

        if(fast == null || fast.next == null){
            return null;
        }

        fast = head;
        while (fast != low){
            fast = fast.next;
            low = low.next;
        }
        return low;
    }
}

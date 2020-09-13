package pratice.week1.second;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-10 15:01
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
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
        return fast;
    }
}

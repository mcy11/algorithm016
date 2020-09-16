package pratice.week1.third;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-16 15:50
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            if(fast == slow){
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast == null || fast.next == null){
            return null;
        }

        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}

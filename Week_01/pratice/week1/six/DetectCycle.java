package pratice.week1.six;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-24 15:13
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while (head != null && head.next != null){
            if(fast == slow){
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        if(head == null || head.next == null){
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

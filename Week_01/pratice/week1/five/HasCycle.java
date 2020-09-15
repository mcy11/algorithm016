package pratice.week1.five;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-15 15:13
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            if(fast == slow){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}

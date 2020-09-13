package pratice.week1.third;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-10 15:42
 */
public class HasCycle {

    public Boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }

        ListNode fast = head.next;
        ListNode low = head;

        while (fast != null && fast.next != null){
            if(low == fast){
                return true;
            }
            low = low.next;
            fast = fast.next.next;
        }
        return false;
    }

}

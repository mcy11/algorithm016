package pratice.week1.second;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-09 22:41
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode low = head;
        ListNode fast = head.next;

        while (fast != null &&  fast.next != null){
            if(low == fast){
                return true;
            }
            low = low.next;
            fast = fast.next.next;
        }
        return false;
    }
}

package pratice.week1.fourth;

import model.ListNode;
import org.w3c.dom.NodeList;

import java.util.List;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 15:45
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode low = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            if(fast == low){
                return true;
            }

            low = low.next;
            fast = fast.next.next;
        }
        return false;

    }
}

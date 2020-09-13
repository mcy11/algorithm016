package pratice.week1.first;

import model.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-09 17:40
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode temp = head;
        if(head == null){
            return null;
        }
        while (temp.next != null){
            if(visited.contains(temp)){
                return temp;
            }
            visited.add(temp);
            temp = temp.next;
        }
        return null;
    }

    public ListNode detectCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

package pratice.week1.second;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-10 14:44
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

}

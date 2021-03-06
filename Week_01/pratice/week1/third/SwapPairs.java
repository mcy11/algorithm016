package pratice.week1.third;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-16 15:54
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

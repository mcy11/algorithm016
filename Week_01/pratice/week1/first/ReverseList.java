package pratice.week1.first;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-09 14:37
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}

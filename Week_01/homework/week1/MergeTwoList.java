package homework.week1;

import model.ListNode;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 12:23
 */
public class MergeTwoList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode end = head;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                end.next = l1;
                l1 = l1.next;
            }else {
                end.next = l2;
                l2 = l2.next;
            }
            end = end.next;
        }

        end.next = l1 == null ? l2 : l1;
        return head.next;
    }
}

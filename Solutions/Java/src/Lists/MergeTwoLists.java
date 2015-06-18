package Lists;

import Core.ListNode;

/**
 * Created by HDegano on 6/17/2015.
 */
public class MergeTwoLists {

    public ListNode Merge(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null) return null;

        if(l1 != null && l2 == null) return l1;

        if(l2 != null && l1 == null) return l2;

        ListNode newHead = null;

        if(l1.val < l2.val){
            newHead = l1;
            newHead.next = Merge(l1.next, l2);
        }

        else
        {
            newHead = l2;
            newHead.next = Merge(l1, l2.next);
        }

        return newHead;
    }
}

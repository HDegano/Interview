package Lists;

import Core.ListNode;

/**
 * Created by HDegano on 6/17/2015.
 */
public class ReverseLinkedList {
    public ListNode ReverseLinkList(ListNode head){

        if(head == null) return null;

        ListNode current = head;
        ListNode prev = null;
        ListNode reverseHead = null;

        while(current != null){

            ListNode currentNext = current.next;
            if(currentNext == null)
                reverseHead = current;

            current.next = prev;
            prev = current;
            current = currentNext;
        }

        return reverseHead;
    }
}

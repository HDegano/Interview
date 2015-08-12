package Lists;

import Core.ListNode;

/**
 * Created by HDegano on 7/1/2015.
 */

public class ReverseKNodes {

    public ListNode reverse(ListNode head,int k){
        if(head == null){
            return null;
        }
        ListNode front = null;
        ListNode middle = head;
        ListNode end = null;
        int i=0;
        while(middle != null && i < k){
            end = middle.next;
            middle.next = front;
            front = middle;
            middle = end;
            i++;
        }
        head.next = reverse(middle,k);
        return front;
    }
}
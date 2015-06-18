package Lists;

import Core.ListNode;

/**
 * Created by HDegano on 6/17/2015.
 */
public class KthNodeFromTail {

    public ListNode FindKthNode(ListNode head, int n){

        if(head == null || n <= 0) return null;

        ListNode fast = head;

        //Verify what is Kth to the last
        // 1 -> 2 -> 3 and k = 1, if K = 3 or K = 2. For now assume the former is correct
        int stepAhead = n - 1;

        for(int i = 0; i < stepAhead; i++){
            if(fast.next == null)
                return null;
            fast = fast.next;
        }

        ListNode current = head;

        while(fast != null){
            fast = fast.next;
            current = current.next;
        }

        return current;
    }
}

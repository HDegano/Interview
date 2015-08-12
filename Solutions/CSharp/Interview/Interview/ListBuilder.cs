namespace Interview
{
    public static class ListBuilder
    {
        public static ListNode BuildList(params int[] val)
        {
            if (val.Length == 0) return null;
            
            ListNode head = new ListNode(val[0]);

            ListNode current = head;

            for (int i = 1; i < val.Length; i++)
            {
                current.next = new ListNode(val[i]);

                current = current.next;
            }

            return head;
        }
    }
}

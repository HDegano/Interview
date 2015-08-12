using System.Collections.Generic;
using System.Net.Sockets;

namespace Interview
{
    public class ListNode
    {
        public int val { get; set; }
        public ListNode next;

        public ListNode(int x)
        {
            val = x;
        }

        public bool SameList(ListNode other)
        {
            if (other == null) return false;

            ListNode current = next;
            ListNode otherCurrent = other.next;

            while (current != null && otherCurrent != null)
            {
                if (current.val != otherCurrent.val) return false;

                current = current.next;
                otherCurrent = otherCurrent.next;
            }

            return current == null && otherCurrent == null;
        }
    }
}
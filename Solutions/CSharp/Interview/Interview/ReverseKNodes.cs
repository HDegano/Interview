using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interview
{
    public class ReverseKNodes
    {
        //reverse sublist of A from m through n 1 <= m <= n
        public ListNode ReverseSubList(ListNode A, int m, int n)
        {
            if (A == null) return A;
            if (m == n) return A;

            ListNode newHead = new ListNode(0);

            ListNode prev = null;
            ListNode start = A;

            int i = 1;

            while (i < m && start != null)
            {
                prev = start;
                start = start.next;
                i++;
            }

            ListNode end = MoveK(start, n - m);

            ListNode runner = end.next;

            ListNode startSubList = ReverseEND(start, end);

            if (prev != null)
                prev.next = startSubList;
            
            start.next = runner;

            if (m == 1) newHead = startSubList;
            else newHead = A;

            return newHead;
        }

        private ListNode MoveK(ListNode n, int k)
        {
            ListNode current = n;

            int i = 0;
            while (current != null && i < k)
            {
                current = current.next;
                i++;
            }

            return current;
        }

        private ListNode ReverseEND(ListNode start, ListNode end)
        {

            ListNode current = start;
            ListNode prev = null;

            ListNode newhead = null;

            ListNode currentNext = null;
            while (current != null && current.val != end.val)
            {
                currentNext = current.next;

                current.next = prev;
                prev = current;
                current = currentNext;
            }

            current.next = prev;

            return current;
        }
        public ListNode ReverseKGroup(ListNode head, int k)
        {
            if (head == null || head.next == null || k <= 0) return head;

            ListNode dummy = new ListNode(-1);
            ListNode preK = head;
            dummy.next = preK;

            ListNode newHead = null;
            ListNode runner = head;
            ListNode startOfK = head;
            ListNode endOfK = null;

            ListNode prevEndOfK = new ListNode(-1);//dummy

            while (runner != null)
            {
                runner = MoveKForward(startOfK, k - 1);

                if (runner == null) break;

                endOfK = runner;
                runner = runner.next;

                Reverse(startOfK, endOfK);
                startOfK.next = runner;

                prevEndOfK.next = startOfK;
                startOfK = runner;

                if (newHead == null)
                    newHead = endOfK;

                runner = runner.next;
            }

            if (newHead == null) return head;

            return newHead;
        }

        public ListNode MoveKForward(ListNode head, int k = 1)
        {
            ListNode current = head;

            int i = 1;

            while (i <= k && current != null)
            {
                current = current.next;
                i++;
            }

            return current;
        }

        private void Reverse(ListNode head, ListNode end)
        {
            ListNode prev = null;
            ListNode current = head;

            while (current != null && current.val != end.val)
            {
                ListNode currentNext = current.next;

                current.next = prev;
                prev = current;
                current = currentNext;
            }

            end.next = prev;
        }
    }
}

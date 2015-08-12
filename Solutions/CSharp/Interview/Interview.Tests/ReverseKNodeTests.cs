using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Interview.Tests
{
    [TestClass]
    public class ReverseKNodeTests
    {
        [TestMethod]
        public void TestBuilder()
        {
            ListNode l1 = new ListNode(1);
            l1.next = new ListNode(2);
            l1.next.next = new ListNode(3);
            var l2 = ListBuilder.BuildList(1, 2, 3);

            Assert.AreEqual(true, l1.SameList(l2));
        }

        [TestMethod]
        public void TestReverseKGroup()
        {
            ListNode l1 = ListBuilder.BuildList(1, 2, 3);
            ListNode l2 = ListBuilder.BuildList(3, 2, 1);
            ReverseKNodes r = new ReverseKNodes();

            //var l3 = r.ReverseKGroup(l1, 3);
            //Assert.AreEqual(true, l2.SameList(l3));

            l1 = ListBuilder.BuildList(1, 2, 3);
            //l2 = ListBuilder.BuildList(3, 2, 1, 6, 5, 4, 7);
            Assert.AreNotEqual(null, r.ReverseSubList(l1, 1, 2));

            //l3 = r.ReverseKGroup(l1, 3);
            //Assert.AreEqual(true, l2.SameList(l3));
        }
    }
}

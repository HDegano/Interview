using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Interview.Tests
{
    [TestClass]
    public class PlusOneTests
    {
        [TestMethod]
        public void TestMethod1()
        {
            PlusOne p = new PlusOne();
            var a = p.AddOne(new int[] {9});
            Assert.AreEqual(a.Length, 2);
        }
    }
}

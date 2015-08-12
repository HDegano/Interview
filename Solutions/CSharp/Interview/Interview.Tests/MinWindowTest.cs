using System;
using System.CodeDom;
using System.Threading;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Interview.Tests
{
    [TestClass]
    public class MinWindowTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            var mw = new MinWindowSubstring();

            Assert.AreEqual("BANC", mw.MinWindow("ADOBECODEBANC", "ABC"));
            Assert.AreEqual("a", mw.MinWindow("a", "a"));
            Assert.AreEqual("a", mw.MinWindow("ab", "a"));
            Assert.AreEqual("ba", mw.MinWindow("bba", "ab"));
            Assert.AreEqual("abc", mw.MinWindow("abc", "cba"));
        }
    }
}

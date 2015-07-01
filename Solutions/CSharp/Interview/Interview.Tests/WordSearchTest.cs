using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Interview.Tests
{
    [TestClass]
    public class WordSearchTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            WordSearch  w = new WordSearch();

            var test = new char[2, 2]
            {
                {'a', 'b'},
                {'c', 'd'}
            };

            Assert.AreEqual(true, w.Exist(test, "cdba"));

            var test2 = new char[,]
            {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'E', 'S'},
                {'A', 'D', 'E', 'E'}
            };

            Assert.IsTrue(w.Exist(test2, "ABCESEEEFS"));
        }
    }
}

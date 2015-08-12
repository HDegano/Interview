using System;

namespace Interview
{
    public class MinEditDistance
    {
        public int MinimumEditDistance(string word1, string word2)
        {
            if (String.IsNullOrEmpty(word1)) return word2.Length;
            if (String.IsNullOrEmpty(word2)) return word1.Length;

            int[,] dp = new int[word2.Length + 1, word1.Length + 1];

            for (int i = 0; i <= word1.Length; i++) dp[0, i] = i;
            for (int i = 0; i <= word2.Length; i++) dp[i, 0] = i;

            for (int i = 1; i < word2.Length + 1; i++)
            for (int j = 1; j < word1.Length + 1; j++)
            {
                if (word1[j - 1] == word2[i - 1])
                    dp[i, j] = dp[i - 1, j - 1];

                else
                    dp[i, j] = getMin(dp[i - 1, j], dp[i, j - 1], dp[i - 1, j - 1]) + 1;
            }

            return dp[word2.Length, word1.Length];
        }

        private int getMin(int a, int b, int c)
        {
            var less = a < b ? a : b;
            return less < c ? less : c;
        }
    
    }
}

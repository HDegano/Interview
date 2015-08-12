using System;
using System.Collections.Generic;

namespace Interview
{
    public class WordSearch
    {
        public bool Exist(char[,] board, string word)
        {
            if (word == null) return false;

            int m = board.GetLength(0);
            int n = board.GetLength(1);

            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (innerFind(board, i, j, word, 0, new HashSet<Tuple<int, int>>()))
                    {
                        return true;
                    }
                }
            }

            return false;
        }

        private bool innerFind(char[,] board, int i, int j, string word, int k, HashSet<Tuple<int, int>> visited)
        {
            if (k >= word.Length) return true;
            if (visited.Contains(new Tuple<int, int>(i, j))) return false;

            if (i < 0 || j < 0 || i >= board.GetLength(0) || j >= board.GetLength(1)) return false;

            if (board[i, j] == word[k])
            {
                visited.Add(new Tuple<int, int>(i, j));

                k++;

                foreach (var offSet in OffSets)
                {
                    if (innerFind(board, i + offSet[0], j + offSet[1], word, k, visited))
                        return true;
                }

                visited.Remove(new Tuple<int, int>(i, j)); //remove from path
            }

            return false;
        }

        private static readonly int[][] OffSets =
        {
            new []{1, 0},
            new []{0, 1},
            new []{-1, 0},
            new []{0, -1}
        };
    }

    
}

using System;
using System.Collections.Generic;

namespace Interview
{
    public class MinWindowSubstring
    {
        public string MinWindow(string s, string t)
        {
            if (String.IsNullOrEmpty(s) || String.IsNullOrEmpty(t)) return string.Empty;
            if (t.Length > s.Length) return string.Empty;

            var map = new Dictionary<char,int>();
            var seen = new Dictionary<char, int>();
            
            foreach (char c in t)
            {
                if (map.ContainsKey(c))
                    map[c]++;
                else
                {
                    map[c] = 1;
                    seen[c] = 0;
                }
            }

            int minV = Int32.MinValue;

            int min_start = 0;
            int window_start = 0;
            int count = 0;

            for (int i = 0; i < s.Length; i++)
            {
                var c = s[i];
                if (map.ContainsKey(s[i]))
                {
                    seen[c]++;
                    if (seen[c] <= map[c])
                        count++;
                }

                if (count == t.Length)
                {
                    while(seen[s[window_start]] > map[s[window_start]])
                }
            }

            if (count < t.Length ||(count > 1 && length == Int32.MinValue)) return string.Empty;

            return s.Substring(startIndex, length); 
        }
    }
}

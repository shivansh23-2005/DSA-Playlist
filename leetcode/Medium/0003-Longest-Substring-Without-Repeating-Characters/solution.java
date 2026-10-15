// LeetCode Problem: Longest Substring Without Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Difficulty: Medium
// Language: java

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int ei=0;
        int si=0;
        int max=0;
        while(ei<s.length())
        {
             while(set.contains(s.charAt(ei)) && si<s.length())
            {
                 set.remove(s.charAt(si));
                 si++;
            }
            set.add(s.charAt(ei));
            max=Math.max(max,ei-si+1);
            ei++;
        }

        return max;
    }
}
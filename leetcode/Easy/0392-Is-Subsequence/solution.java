// LeetCode Problem: Is Subsequence
// Link: https://leetcode.com/problems/is-subsequence/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if(s.length()>t.length()) return false;
        if(s.length()==0) return true;
        while(j<t.length())
        {
            if(i < s.length() && s.charAt(i) == t.charAt(j))
            {
                i++;
            }
            j++;
        }
        if(i==s.length() && j==t.length())
        {
            return true;
        }
        return false;
    }
}
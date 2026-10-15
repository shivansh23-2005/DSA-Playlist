// LeetCode Problem: Check If Two String Arrays are Equivalent
// Link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1=" ";
        String s2=" ";
        for(int i=0;i<word1.length;i++)
        {
             s1=s1+word1[i];
        }
        for(int j=0;j<word2.length;j++)
        {
             s2=s2+word2[j];
        }
        if(s1.equals(s2))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
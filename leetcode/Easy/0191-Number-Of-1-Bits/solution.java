// LeetCode Problem: Number of 1 Bits
// Link: https://leetcode.com/problems/number-of-1-bits/
// Difficulty: Easy
// Language: java

class Solution {
    public int hammingWeight(int n) {
      String b=Integer.toBinaryString(n);
      int count=0;
      for(int i=0;i<b.length();i++)
      {
      if(b.charAt(i)=='1')
      {
        count++;
      }
      }
      return count;  
        
    }
}
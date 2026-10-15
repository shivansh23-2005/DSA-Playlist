// LeetCode Problem: Counting Bits
// Link: https://leetcode.com/problems/counting-bits/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] countBits(int n) {
        int i=0;
        int count=0;
        int  result[]=new int[n+1];
        while(i<=n)
        {
            String str=Integer.toBinaryString(i);
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)=='1')
                {
                    count++;
                }
                result[i]=count;
            }
            count=0;
            i++;
        }
        return result;
    }
}
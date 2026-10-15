// LeetCode Problem: Sum of Compatible Numbers in Range I
// Link: https://leetcode.com/problems/sum-of-compatible-numbers-in-range-i/
// Difficulty: Easy
// Language: java

class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int res=0;
        for(int x=Math.max(1,n-k);x<=n+k;x++)
            {
                if((n&x)==0)
                {
                    res+=x;
                }
            }
        return res;
    }
}
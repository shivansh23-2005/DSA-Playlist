// LeetCode Problem: Sum of Digits in Base K
// Link: https://leetcode.com/problems/sum-of-digits-in-base-k/
// Difficulty: Easy
// Language: java

class Solution {
    public int sumBase(int n, int k) {
        String s=Integer.toString(n,k);
        int num=Integer.parseInt(s);
        int sum,rem;
        sum=0;

        while(num!=0)
        {
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;

        
    }
}
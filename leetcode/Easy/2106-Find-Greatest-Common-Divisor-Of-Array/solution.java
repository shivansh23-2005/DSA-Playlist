// LeetCode Problem: Find Greatest Common Divisor of Array
// Link: https://leetcode.com/problems/find-greatest-common-divisor-of-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int m=Integer.MIN_VALUE;
        int i=1;
        while(i<=max)
        {
            if(min%i==0 && max %i ==0)
            {
                m=Math.max(m,i);
            }
            i++;
        }
        return m;
        
    }
}
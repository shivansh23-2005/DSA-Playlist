// LeetCode Problem: Maximum Subarray
// Link: https://leetcode.com/problems/maximum-subarray/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxSubArray(int[] nums) {
        int m=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<nums.length;i++)
        {
            curr+=nums[i];
            m=Math.max(m,curr);
            if(curr<0)
            {
                curr=0;
            }
        }
        return m;

        
    }
}
// LeetCode Problem: Minimum Size Subarray Sum
// Link: https://leetcode.com/problems/minimum-size-subarray-sum/
// Difficulty: Medium
// Language: java

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int si=0;
        int ei=0;
        int sum=0;
        int size=Integer.MAX_VALUE;
        while(ei<nums.length)
        {
            sum+=nums[ei];
            while(sum>=target)
            {
                size=Math.min(size,ei-si+1);
                sum -= nums[si];
                si++;
            }
                ei++;
        }
        if(size==Integer.MAX_VALUE)
        {
            return 0;
        }
        return size;
    }
}
// LeetCode Problem: Single Number II
// Link: https://leetcode.com/problems/single-number-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                i+=2;
            }
            else
            {
                return nums[i];
            }
        }
        return nums[nums.length-1];
        
    }
}
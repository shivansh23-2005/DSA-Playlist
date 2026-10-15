// LeetCode Problem: Minimum Distance to the Target Element
// Link: https://leetcode.com/problems/minimum-distance-to-the-target-element/
// Difficulty: Easy
// Language: java


class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target){
                result = Math.min(result, Math.abs(i - start)); 
            }
        }
        return result;
    }
}
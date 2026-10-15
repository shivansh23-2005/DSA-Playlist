// LeetCode Problem: Kth Largest Element in an Array
// Link: https://leetcode.com/problems/kth-largest-element-in-an-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
          return nums[nums.length - k];
        
        
    }
}
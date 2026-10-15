// LeetCode Problem: Find First and Last Position of Element in Sorted Array
// Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Difficulty: Medium
// Language: cpp

class Solution {
 public:
  vector<int> searchRange(vector<int>& nums, int target) {
    const int l = ranges::lower_bound(nums, target) - nums.begin();
    if (l == nums.size() || nums[l] != target)
      return {-1, -1};
    const int r = ranges::upper_bound(nums, target) - nums.begin() - 1;
    return {l, r};
  }
};
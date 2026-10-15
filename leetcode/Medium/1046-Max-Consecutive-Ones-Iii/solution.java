// LeetCode Problem: Max Consecutive Ones III
// Link: https://leetcode.com/problems/max-consecutive-ones-iii/
// Difficulty: Medium
// Language: java

class Solution {
    public int longestOnes(int[] nums, int k) {
        int si = 0;
        int ei = 0;
        int max = 0;
        int count = 0;

        while (ei < nums.length) {

            if (nums[ei] == 0) {
                count++;
            }

            while (count > k) {
                if (nums[si] == 0) {
                    count--;
                }
                si++;
            }
            max = Math.max(max, ei - si+1);
            ei++;
        }

        return max;
    }
}
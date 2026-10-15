// LeetCode Problem: Maximum Product Subarray
// Link: https://leetcode.com/problems/maximum-product-subarray/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int a = nums[i];

            if(a < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(a, max * a);
            min = Math.min(a, min * a);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}
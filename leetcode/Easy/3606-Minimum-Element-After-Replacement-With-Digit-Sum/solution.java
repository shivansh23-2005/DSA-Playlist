// LeetCode Problem: Minimum Element After Replacement With Digit Sum
// Link: https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/
// Difficulty: Easy
// Language: java

class Solution {
    public int minElement(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int sum = 0;

            while (num != 0) {
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }

            min = Math.min(min, sum);
        }

        return min;
    }
}
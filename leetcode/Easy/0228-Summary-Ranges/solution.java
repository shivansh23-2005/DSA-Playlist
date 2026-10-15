// LeetCode Problem: Summary Ranges
// Link: https://leetcode.com/problems/summary-ranges/
// Difficulty: Easy
// Language: java

class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();

        if (nums.length == 0) return ans;

        int start = nums[0];

        for (int i = 0; i < nums.length; i++) {

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (start == nums[i]) {
                ans.add(String.valueOf(start));
            } else {
                ans.add(start + "->" + nums[i]);
            }

            if (i + 1 < nums.length)
                start = nums[i + 1];
        }

        return ans;
    }
}
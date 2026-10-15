// LeetCode Problem: Relative Ranks
// Link: https://leetcode.com/problems/relative-ranks/
// Difficulty: Easy
// Language: java

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] ans = new String[n];

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {

            if (i == 0)
                ans[arr[i][1]] = "Gold Medal";
            else if (i == 1)
                ans[arr[i][1]] = "Silver Medal";
            else if (i == 2)
                ans[arr[i][1]] = "Bronze Medal";
            else
                ans[arr[i][1]] = String.valueOf(i + 1);
        }

        return ans;
    }
}
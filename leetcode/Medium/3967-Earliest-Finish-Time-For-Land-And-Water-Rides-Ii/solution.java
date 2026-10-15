// LeetCode Problem: Earliest Finish Time for Land and Water Rides II
// Link: https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int landFirst = calc(landStartTime, landDuration,
                             waterStartTime, waterDuration);

        int waterFirst = calc(waterStartTime, waterDuration,
                              landStartTime, landDuration);

        return Math.min(landFirst, waterFirst);
    }

    private int calc(int[] start1, int[] dur1,
                     int[] start2, int[] dur2) {

        int minEnd = Integer.MAX_VALUE;

        for (int i = 0; i < start1.length; i++) {
            minEnd = Math.min(minEnd, start1[i] + dur1[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < start2.length; i++) {
            ans = Math.min(ans,
                           Math.max(minEnd, start2[i]) + dur2[i]);
        }

        return ans;
    }
}
// LeetCode Problem: Non-overlapping Intervals
// Link: https://leetcode.com/problems/non-overlapping-intervals/
// Difficulty: Medium
// Language: java

class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {

        ArrayList<int[]> list = new ArrayList<>();

        int count = 0;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        list.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int element[] = list.get(list.size() - 1);
            if (element[1] > intervals[i][0]) {

                count++;
                if (intervals[i][1] < element[1]) {
                    list.set(list.size() - 1, intervals[i]);
                }
            }

            else {
                list.add(intervals[i]);
            }
        }

        return count;
    }
}
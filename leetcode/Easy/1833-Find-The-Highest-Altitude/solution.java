// LeetCode Problem: Find the Highest Altitude
// Link: https://leetcode.com/problems/find-the-highest-altitude/
// Difficulty: Easy
// Language: java

class Solution {
    public int largestAltitude(int[] gain) {
        int distance=0;
        int ansmax=0;
        for(int i=0;i<gain.length;i++)
        {
            distance=distance+gain[i];
            ansmax=Math.max(ansmax,distance);
        }
        return ansmax;
    }
}
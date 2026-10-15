// LeetCode Problem: Number of Students Doing Homework at a Given Time
// Link: https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
// Difficulty: Easy
// Language: java

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0;i<startTime.length;i++)
        {
        if(startTime[i]<=queryTime && queryTime<=endTime[i])
            {
               count++;
            }
        }
        
       return count; 
    }
}
// LeetCode Problem: Squares of a Sorted Array
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            a[j]+=nums[i]*nums[i];
            j++;
        }
        Arrays.sort(a);
       return a; 
    }
}
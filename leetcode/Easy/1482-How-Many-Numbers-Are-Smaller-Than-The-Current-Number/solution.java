// LeetCode Problem: How Many Numbers Are Smaller Than the Current Number
// Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int array[]=new int[nums.length];
        int count=0;
       for(int j=0;j<nums.length;j++)
       {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[j]>nums[i])
            {
                count++;
            }
        }
        array[j]=count;
        count=0;
       } 
        return array;
    }
}
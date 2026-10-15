// LeetCode Problem: Left and Right Sum Differences
// Link: https://leetcode.com/problems/left-and-right-sum-differences/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arrleft[]=new int[nums.length];
        int arrright[]=new int[nums.length];
           int result[]=new int[nums.length];
        arrleft[0]=0;
        for(int i=0;i<nums.length-1;i++)
        {
            arrleft[i+1]=arrleft[i]+nums[i];
        }
        arrright[nums.length-1]=0;
        for(int j=nums.length-1;j>0;j--)
        {
            arrright[j-1]=arrright[j]+nums[j];
        }
        for(int p=0;p<result.length;p++)
        {
            result[p]=Math.abs(arrleft[p]-arrright[p]);

        }
        return result;
    }
}
// LeetCode Problem: Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Language: java

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(i<j && j<nums.length)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0)
            {
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
    }
}
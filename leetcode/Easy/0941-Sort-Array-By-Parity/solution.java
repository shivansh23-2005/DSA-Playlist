// LeetCode Problem: Sort Array By Parity
// Link: https://leetcode.com/problems/sort-array-by-parity/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int array[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++) 
        {
            if(nums[i]%2==0)
            {
                array[j]=nums[i];
                j+=1;

            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                array[j]=nums[i];
                j+=1; 
            }
        }
        return array;
        
    }
}
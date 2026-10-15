// LeetCode Problem: Single Number
// Link: https://leetcode.com/problems/single-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int singleNumber(int[] nums) {
          Arrays.sort(nums);
          int j=0;
        if(nums.length==1)
        {
            return nums[0];
        }  
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                i+=1;
            }

            else
            {
                 return nums[i];
            }
    }
    return nums[nums.length-1];
}
}
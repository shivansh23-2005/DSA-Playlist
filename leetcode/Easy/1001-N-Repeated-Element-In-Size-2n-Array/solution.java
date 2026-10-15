// LeetCode Problem: N-Repeated Element in Size 2N Array
// Link: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[j]==nums[i])
            {
                return nums[i];
            }
            j++;
        }
        return -1;
    }
}
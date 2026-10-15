// LeetCode Problem: Missing Number
// Link: https://leetcode.com/problems/missing-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        while(i<=nums.length-1)
        {
            if(nums[i]!=i)
            {
                return i;
            }
           i++;
        }
        return nums.length;
    }
}
// LeetCode Problem: Target Sum
// Link: https://leetcode.com/problems/target-sum/
// Difficulty: Medium
// Language: java

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);

    }
    int solve(int[]nums,int target,int index,int sum)
    {
        if(index==nums.length)
        {
            if(sum==target)
            {
                 return 1;
            }
            else
            {
                return 0;
            }
          
        }
        int plus=solve(nums,target,index+1,sum+nums[index]);
        int minus=solve(nums,target,index+1,sum-nums[index]);
        return plus+minus;
    }
}
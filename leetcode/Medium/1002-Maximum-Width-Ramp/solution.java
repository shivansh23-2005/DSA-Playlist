// LeetCode Problem: Maximum Width Ramp
// Link: https://leetcode.com/problems/maximum-width-ramp/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxWidthRamp(int[] nums) {
        int suffix[]=new int[nums.length];
        int max=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            max=Math.max(max,nums[i]);
            suffix[i]=max;
        }
        int i=0;
        int j=1;
        int ans=0;
        while(j<nums.length)
        {
            if(nums[i]<=suffix[j])
            {
                ans=Math.max(ans,j-i);
                j++;
            }
            else
            {
                i++;
            }
        }
        return ans;
    }
}
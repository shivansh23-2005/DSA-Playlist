// LeetCode Problem: Find the Smallest Divisor Given a Threshold
// Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
// Difficulty: Medium
// Language: java

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            high=Math.max(high,nums[i]);
        }
        int low=1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(ispossible(nums,mid,threshold))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
        
    }
    Boolean ispossible(int[]nums,int mid,int k)
    {
        long thresold=0;
        for(int i=0;i<nums.length;i++)
        {
             thresold+=(int)(Math.ceil((double)nums[i]/mid));
        }
        if(thresold<=k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
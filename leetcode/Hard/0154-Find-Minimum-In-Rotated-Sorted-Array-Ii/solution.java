// LeetCode Problem: Find Minimum in Rotated Sorted Array II
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
// Difficulty: Hard
// Language: java

class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
               ans = Math.min(ans, nums[mid]);
    low++;
    high--;
    continue;
}
                 if(nums[low]<=nums[mid])
                 {
                    ans=Math.min(ans,nums[low]);
                    low=mid+1;     
                 }  
                 else
                 {
                  ans=Math.min(ans,nums[mid]);
                    high=mid-1;  
                    
                 }
        }
        return ans;
    }
}
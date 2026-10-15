// LeetCode Problem: Search in Rotated Sorted Array II
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            return true;

            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                low=low+1;
                high=high-1;
                continue;
            }
            if(nums[mid]<=nums[high])    //right half is sorted 
            {
                if(nums[mid]<=target && target<=nums[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
  
            }
            else                   // left half will be sorted
            {
                 if(nums[mid]>=target && target>=nums[low])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }

        }
        return false;
    }
}
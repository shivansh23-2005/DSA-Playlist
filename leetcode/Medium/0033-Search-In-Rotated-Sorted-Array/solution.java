// LeetCode Problem: Search in Rotated Sorted Array
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
               return mid;
            }
        if(nums[mid]<=nums[high])       //rigth half is sorted 
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
        else                         // left half is sorted 
        {
            if(nums[mid]>=target && target>=nums[low] )
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }
        }
        return -1;
        
    }
}
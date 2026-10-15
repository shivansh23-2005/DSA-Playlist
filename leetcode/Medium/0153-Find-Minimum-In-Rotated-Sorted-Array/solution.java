// LeetCode Problem: Find Minimum in Rotated Sorted Array
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>nums[high])
            {
                low=mid+1;
            }
            else
            {
                high=high-1;
            }
        }
        return nums[low];
    }
}
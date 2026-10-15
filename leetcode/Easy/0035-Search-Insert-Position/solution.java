// LeetCode Problem: Search Insert Position
// Link: https://leetcode.com/problems/search-insert-position/
// Difficulty: Easy
// Language: java

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;

            else if(nums[mid]<target)
            {
                low=low+1;
            }
            else
            {
                high=mid-1;  
            }
        }
            return low;
        
    }
}
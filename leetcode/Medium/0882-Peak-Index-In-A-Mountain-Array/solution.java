// LeetCode Problem: Peak Index in a Mountain Array
// Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid-1])
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        return -1;
    }
}
// LeetCode Problem: Merge Sorted Array
// Link: https://leetcode.com/problems/merge-sorted-array/
// Difficulty: Easy
// Language: java

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<(m+n);i++)
        {
            nums1[i]+=nums2[j];
           j++;
        }
    Arrays.sort(nums1);
    }}
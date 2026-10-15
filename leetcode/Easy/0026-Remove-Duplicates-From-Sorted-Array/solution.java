// LeetCode Problem: Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy
// Language: java


class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer>h1=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            h1.add(nums[i]);
        }
        System.out.println(h1);
        int a=0;
        for(int j:h1)
        {
            nums[a]=j;
            a+=1;
        }
         return h1.size();
    }
}
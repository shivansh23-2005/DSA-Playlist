// LeetCode Problem: Maximum Gap
// Link: https://leetcode.com/problems/maximum-gap/
// Difficulty: Medium
// Language: java

class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        if(nums.length<2)
        {
            return 0;
        }
        int i=0;
        int j=1;
        while(i<=nums.length-2)
        {
            int ele=nums[j]-nums[i];
            max=Math.max(max,ele);
            i++;
            j++;
        }
        return max;
    }
}
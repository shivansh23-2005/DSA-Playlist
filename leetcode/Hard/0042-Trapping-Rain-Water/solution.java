// LeetCode Problem: Trapping Rain Water
// Link: https://leetcode.com/problems/trapping-rain-water/
// Difficulty: Hard
// Language: java

class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmaxarr[]=new int[n];
        int rightmaxarr[]=new int[n];
        int ans=0;
        leftmaxarr[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            leftmaxarr[i]=Math.max(leftmaxarr[i-1],height[i]);
        }
        rightmaxarr[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            rightmaxarr[i]=Math.max(rightmaxarr[i+1],height[i]);
        }
        for(int i=0;i<height.length;i++)
        {
            ans+=Math.min(leftmaxarr[i],rightmaxarr[i])-height[i];
        }
        return ans;
    }
}
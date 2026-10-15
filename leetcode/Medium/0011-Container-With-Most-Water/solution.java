// LeetCode Problem: Container With Most Water
// Link: https://leetcode.com/problems/container-with-most-water/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=Integer.MIN_VALUE;
        while(left<right)
        {
            int l=Math.min(height[left],height[right]);
            int w=right-left;
            area=Math.max(area,l*w);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        
        }
        return area;
        
    }
}
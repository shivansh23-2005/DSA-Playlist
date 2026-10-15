// LeetCode Problem: Concatenation of Array
// Link: https://leetcode.com/problems/concatenation-of-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=2*nums.length;
       int ans[]=new int[size];
       int i=0;
       while(i<nums.length)
       {
        ans[i]=nums[i];
        i++;
       }
       int j=0;
       while(i<ans.length)
       {
        ans[i]=nums[j];
        i++;
        j++;
       }
       return ans;
    }
}
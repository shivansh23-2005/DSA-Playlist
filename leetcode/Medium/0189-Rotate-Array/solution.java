// LeetCode Problem: Rotate Array
// Link: https://leetcode.com/problems/rotate-array/
// Difficulty: Medium
// Language: java

class Solution {
      public static void r(int nums[],int i,int j)
    {
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
    }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
            k %= n;
        r(nums,0,n-1);
        r(nums,0,k-1);
        r(nums,k,n-1);
        
    }
}
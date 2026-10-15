// LeetCode Problem: Duplicate Zeros
// Link: https://leetcode.com/problems/duplicate-zeros/
// Difficulty: Easy
// Language: java

class Solution {
    public void duplicateZeros(int[] arr) {
        int[] nums = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length && j < arr.length; i++) {    
            if (arr[i] == 0) {
                
                if (j < arr.length) {
                    nums[j] = 0;
                }
                if (j + 1 < arr.length) {
                    nums[j + 1] = 0;
                }
                j += 2;
            } else {
               
                if (j < arr.length) {
                    nums[j] = arr[i];
                }
                j++;
            }
        }
        for (int q = 0; q < arr.length; q++) {
            arr[q] = nums[q];
        }
    }
}

// LeetCode Problem: Kth Missing Positive Number
// Link: https://leetcode.com/problems/kth-missing-positive-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int findKthPositive(int[] arr, int k) {

        int current = 1;
        int i = 0;

        while (k > 0) {

            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                k--;
                if (k == 0)
                    return current;
            }

            current++;
        }

        return current;
    }
}
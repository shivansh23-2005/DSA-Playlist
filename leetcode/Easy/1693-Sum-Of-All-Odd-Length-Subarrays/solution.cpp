// LeetCode Problem: Sum of All Odd Length Subarrays
// Link: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int n = arr.size();
        int totalSum = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if ((j - i + 1) % 2 == 1) { // check for odd length
                    int subarraySum = 0;
                    for(int k = i; k <= j; k++) {
                        subarraySum += arr[k];
                    }
                    totalSum += subarraySum;
                }
            }
        }

        return totalSum;
    }
};

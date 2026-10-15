// LeetCode Problem: Base 7
// Link: https://leetcode.com/problems/base-7/
// Difficulty: Easy
// Language: java

class Solution {
    public String convertToBase7(int num) {
        String base7 = Integer.toString(num, 7);
        return base7;
    }
}
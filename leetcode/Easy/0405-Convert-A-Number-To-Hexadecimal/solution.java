// LeetCode Problem: Convert a Number to Hexadecimal
// Link: https://leetcode.com/problems/convert-a-number-to-hexadecimal/
// Difficulty: Easy
// Language: java

class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        String hex = "";
        String digits = "0123456789abcdef";

        while (num != 0 && hex.length() < 8) {
            int rem = num & 15;
            hex = digits.charAt(rem) + hex;
            num >>= 4;
        }
        return hex;
    }
}

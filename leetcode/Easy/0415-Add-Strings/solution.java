// LeetCode Problem: Add Strings
// Link: https://leetcode.com/problems/add-strings/
// Difficulty: Easy
// Language: java

import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger sum = n1.add(n2);
        return sum.toString();
    }
}
// LeetCode Problem: Plus One
// Link: https://leetcode.com/problems/plus-one/
// Difficulty: Easy
// Language: java

import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            s.append(digits[i]);
        }
        BigInteger a = new BigInteger(s.toString());
        BigInteger b = a.add(BigInteger.ONE);
        String s3 = b.toString();
        int[] result = new int[s3.length()];
        for (int i = 0; i < s3.length(); i++) {
            result[i] = s3.charAt(i) - '0';
        }
        
        return result;
    }
}

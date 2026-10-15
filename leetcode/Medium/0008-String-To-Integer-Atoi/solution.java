// LeetCode Problem: String to Integer (atoi)
// Link: https://leetcode.com/problems/string-to-integer-atoi/
// Difficulty: Medium
// Language: java

class Solution {
    public int myAtoi(String s) {

        String result = "";
        String s1 = s.trim();

        if (s1.length() == 0)
            return 0;

        int i = 0;

        if (s1.charAt(0) == '+' || s1.charAt(0) == '-') {
            result += s1.charAt(0);
            i++;
        }

        for (; i < s1.length(); i++) {

            if (Character.isDigit(s1.charAt(i))) {
                result += s1.charAt(i);
            } else {
                break;
            }
        }

        if (result.equals("") || result.equals("+") || result.equals("-"))
            return 0;

        try {
            long num = Long.parseLong(result);

            if (num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            return (int) num;

        } catch (NumberFormatException e) {

            if (result.charAt(0) == '-')
                return Integer.MIN_VALUE;

            return Integer.MAX_VALUE;
        }
    }
}
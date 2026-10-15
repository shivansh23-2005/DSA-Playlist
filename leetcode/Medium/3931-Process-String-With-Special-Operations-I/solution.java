// LeetCode Problem: Process String with Special Operations I
// Link: https://leetcode.com/problems/process-string-with-special-operations-i/
// Difficulty: Medium
// Language: java

class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                sb.append(sb);
            } 
            else if (ch == '%') {
                sb.reverse();
            } 
            else if (ch == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } 
            else {
                sb.append(ch);
            }
        }

        return new String(sb);
    }
}
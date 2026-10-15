// LeetCode Problem: Find the Index of the First Occurrence in a String
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            String sub = haystack.substring(i, i + m);

            if (sub.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

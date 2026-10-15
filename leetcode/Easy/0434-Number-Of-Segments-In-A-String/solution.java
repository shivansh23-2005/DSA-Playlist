// LeetCode Problem: Number of Segments in a String
// Link: https://leetcode.com/problems/number-of-segments-in-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int countSegments(String s) {
            if (s.trim().isEmpty()) {
            return 0;
        }

        s = s.trim().replaceAll("\\s+", " ");
        String[] parts = s.split(" ");
        
        return parts.length;
    }
}

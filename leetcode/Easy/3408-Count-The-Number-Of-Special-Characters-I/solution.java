// LeetCode Problem: Count the Number of Special Characters I
// Link: https://leetcode.com/problems/count-the-number-of-special-characters-i/
// Difficulty: Easy
// Language: java

class Solution {
    public int numberOfSpecialChars(String word) {

        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();

        for (char ch : word.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                lower.add(ch);
            } else {
                upper.add(Character.toLowerCase(ch));
            }
        }

        int count = 0;

        for (char ch : lower) {
            if (upper.contains(ch)) {
                count++;
            }
        }

        return count;
    }
}
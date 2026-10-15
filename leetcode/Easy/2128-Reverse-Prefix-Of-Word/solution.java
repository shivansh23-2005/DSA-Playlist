// LeetCode Problem: Reverse Prefix of Word
// Link: https://leetcode.com/problems/reverse-prefix-of-word/
// Difficulty: Easy
// Language: java

class Solution {
    public String reversePrefix(String word, char ch) {
        String s1 = "";
        int i;
        for (i = 0; i < word.length(); i++) {
            s1 = word.charAt(i) + s1;
            if (word.charAt(i) == ch) {
                break;
            }
        }
        if (i == word.length()) {
            return word;
        }
        for (int j = i + 1; j < word.length(); j++) {
            s1 = s1 + word.charAt(j);
        }

        return s1;
    }
}

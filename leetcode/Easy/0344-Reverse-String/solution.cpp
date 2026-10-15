// LeetCode Problem: Reverse String
// Link: https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    void reverseString(vector<char>& s) {
        int i = 0, j = s.size() - 1; // Initialize pointers
        while (i < j) {
            // Swap characters
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++; // Move forward
            j--; // Move backward
        }
    }
};

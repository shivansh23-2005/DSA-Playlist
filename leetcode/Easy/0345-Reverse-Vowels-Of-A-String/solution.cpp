// LeetCode Problem: Reverse Vowels of a String
// Link: https://leetcode.com/problems/reverse-vowels-of-a-string/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    string reverseVowels(string s) {
        int left = 0;
        int right = s.length() - 1;
        char temp;

        while (left < right) {
            // Check for vowels at the left pointer
            if ((s[left] != 'a' && s[left] != 'e' && s[left] != 'i' && 
                 s[left] != 'o' && s[left] != 'u' && 
                 s[left] != 'A' && s[left] != 'E' && 
                 s[left] != 'I' && s[left] != 'O' && 
                 s[left] != 'U')) {
                left++;
            } 
            // Check for vowels at the right pointer
            else if ((s[right] != 'a' && s[right] != 'e' && s[right] != 'i' && 
                       s[right] != 'o' && s[right] != 'u' && 
                       s[right] != 'A' && s[right] != 'E' && 
                       s[right] != 'I' && s[right] != 'O' && 
                       s[right] != 'U')) {
                right--;
            } 
            // Swap vowels
            else {
                temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }

        return s;  
    }
};

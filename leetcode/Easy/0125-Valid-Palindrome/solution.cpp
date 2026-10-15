// LeetCode Problem: Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    bool isPalindrome(string s) 
    {
        int i=0;
        int j=s.size()-1;
        while(i<j)
        {
        
            if(!isalnum(s[i]))
            {
                i++;
                continue;
        
            }
            else if(!isalnum(s[j]))
            {
                j--;
                   continue;
            }
            else
            {
                if(tolower(s[i])!=tolower(s[j]))
                {
                return false;
                }
                else
                {
                 i++;
                j--;
                }
            }
        }
      return true;
    }
};
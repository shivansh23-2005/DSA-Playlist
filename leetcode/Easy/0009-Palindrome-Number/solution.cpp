// LeetCode Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    bool isPalindrome(int x) {
        long long int copy=x;
        long long int rem,result;
          result=0;
        while(copy>0)
        {
          rem=copy%10;
          result=result*10+rem;
          copy=copy/10;
        }
    if(result==x)
    {
         return true;
    }
    return false;
    }
};
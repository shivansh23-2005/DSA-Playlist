// LeetCode Problem: Fibonacci Number
// Link: https://leetcode.com/problems/fibonacci-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int fib(int n) {
         if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
}
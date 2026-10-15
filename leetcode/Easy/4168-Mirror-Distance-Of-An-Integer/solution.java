// LeetCode Problem: Mirror Distance of an Integer
// Link: https://leetcode.com/problems/mirror-distance-of-an-integer/
// Difficulty: Easy
// Language: java

class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int rev=0;
        while (temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        int result=Math.abs(n-rev);
        return result;
    }
}
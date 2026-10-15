// LeetCode Problem: Add Digits
// Link: https://leetcode.com/problems/add-digits/
// Difficulty: Easy
// Language: java

class Solution {
    public int addDigits(int num) {
        int rem;
        int sum=0;
        if(num<10)
        {
            return num;
        }
            while(num!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(sum>=10)
        {
          return addDigits(sum);   
        }
        return sum;
}
}
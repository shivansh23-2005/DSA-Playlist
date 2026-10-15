// LeetCode Problem: Valid Perfect Square
// Link: https://leetcode.com/problems/valid-perfect-square/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==1)  
        {
            return 1;
        }
        long long int low=1,high=num/2;
        while(low<=high)
        {
            long long int mid=low+((high-low)/2);
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid<num)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
};
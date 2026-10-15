// LeetCode Problem: Sqrt(x)
// Link: https://leetcode.com/problems/sqrtx/
// Difficulty: Easy
// Language: java

class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        int ans=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(mid*mid<=x)
            {
                ans=(int)mid;
                low=(int)mid+1;
            }
            else
            {
                high=(int)mid-1;
            }
        }
        return ans;
        
    }
}
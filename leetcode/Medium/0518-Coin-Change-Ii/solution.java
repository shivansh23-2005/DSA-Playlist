// LeetCode Problem: Coin Change II
// Link: https://leetcode.com/problems/coin-change-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length+1][amount+1];
        for(int a[]:dp)
      {
        Arrays.fill(a,-1);
      }
       return solve(coins,amount,0,0,dp); 
    }
    int solve(int coins[],int amount,int index,int csum,int dp[][])
    {
        if(csum==amount) return 1;
        if(csum>amount || index>=coins.length) return 0;
        if(dp[index][csum]!=-1)
        {
            return dp[index][csum];
        }
        int left=solve(coins,amount,index,csum+coins[index],dp);
       int right= solve(coins,amount,index+1,csum,dp);
       return dp[index][csum]=left+right;
    }
}
// LeetCode Problem: Unique Paths
// Link: https://leetcode.com/problems/unique-paths/
// Difficulty: Medium
// Language: java

class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[101][101];
        for(int a[]:dp)
        {
            Arrays.fill(a,-1);
        }
      int grid[][]=new int[m][n];
      return solve(grid,0,0,dp);  
    }
    int solve(int grid[][],int sr,int sc,int dp[][])
    {
        if(sr==grid.length-1 && sc==grid[0].length-1)
        {
            return 1;
        }
        if(sr>=grid.length ||sc>=grid[0].length) 
        {
            return 0;
        }
        if(dp[sr][sc]!=-1)
        {
            return dp[sr][sc];
        }
        int left=solve(grid,sr+1,sc,dp);
        int right=solve(grid,sr,sc+1,dp);
        return dp[sr][sc]=left+right;
    }
}
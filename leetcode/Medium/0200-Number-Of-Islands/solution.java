// LeetCode Problem: Number of Islands
// Link: https://leetcode.com/problems/number-of-islands/
// Difficulty: Medium
// Language: java

class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    ans++;
                    solve(grid,i,j);
                }
            }
        }
        return ans;
    }
    public static void solve(char grid[][],int sr,int sc)
    {
        if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length || grid[sr][sc]!='1')
        {
            return;
        }
        grid[sr][sc]='#';
        solve(grid,sr+1,sc);
        solve(grid,sr,sc+1);
        solve(grid,sr-1,sc);
        solve(grid,sr,sc-1);
    }
}
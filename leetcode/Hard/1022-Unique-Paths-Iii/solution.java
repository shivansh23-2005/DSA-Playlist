// LeetCode Problem: Unique Paths III
// Link: https://leetcode.com/problems/unique-paths-iii/
// Difficulty: Hard
// Language: java

class Solution {
    int ans=0;
    int totalcountof0=0;
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
                 for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                { 
                    totalcountof0++;
                }
            }
        }
              for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                { 
                   solve(grid,i,j,0,visited);
                }
            }
        }
        return ans;   
    }
    void solve(int[][]grid,int sr,int sc,int count,boolean visited[][])
    {
  
        if(sr<0||sc<0||sr>grid.length-1 ||sc>grid[0].length-1||grid[sr][sc]==-1||visited[sr][sc])
        {
            return;
        }
        if(grid[sr][sc]==2)
        {
            if(count==totalcountof0)
            {
                ans=ans+1;
            }
            else
            {
                return;
            }
        }
        visited[sr][sc]=true;
        int newcount=count;
        if(grid[sr][sc]==0)
        {
            newcount++;
        }
        //up
        solve(grid,sr-1,sc,newcount,visited);
        //down 
        solve(grid,sr+1,sc,newcount,visited);
        //left
        solve(grid,sr,sc-1,newcount,visited);
        //right
        solve(grid,sr,sc+1,newcount,visited);
        visited[sr][sc]=false;

    }
}
// LeetCode Problem: N-Queens
// Link: https://leetcode.com/problems/n-queens/
// Difficulty: Hard
// Language: java

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char grid[][]=new char[n][n];
        for(char a[]:grid)
        {
            Arrays.fill(a,'.');
        }
        solve(grid,0,0,ans);
        return ans;
    }
    void solve(char grid[][],int sr,int sc, List<List<String>>list)
    {
        if(sr==grid.length)
        {
            List<String> temp = new ArrayList<>();
           for(int i = 0; i < grid.length; i++)
{
    temp.add(new String(grid[i]));
}

list.add(temp);
return;
        }
        for(int col=0;col<grid.length;col++)
        {
            if(ispossible(grid,sr,col))
            {
                grid[sr][col]='Q';
                solve(grid,sr+1,col,list);
                grid[sr][col]='.';
            }
        }
    }
    boolean ispossible(char [][]grid,int row,int col)
    {
        int r=row;
        int c=col;
        //check upper 
        while(r>=0)
        {
            if(grid[r][col]=='Q')
            {
                return false;
            }
            r--;
        }
        //check right
        r=row;
        c=col;
        while(r>=0 && c<grid.length)
        {
            if(grid[r][c]=='Q')
            {
                return false;
            }
            r--;
            c++;
        }
        //check left
        r=row;
        c=col;
        while(r>=0 && c>=0)
        {
            if(grid[r][c]=='Q')
            {
                return false;
            }
            r--;
            c--;
        }
        return true;
    }

}
class Solution {
    static int count=0; 
    public int totalNQueens(int n) {
        count=0;
        char grid[][]=new char[n][n];
        solve(grid,0,0,n);   
        return count;
    }
    void solve(char grid[][],int row,int col,int n)
    {
        if(row==n)
        {
            count++;
            return;
        }
    for(int c=0;c<n;c++)
    {
        if(ispossible(grid,row,c))
        {
            grid[row][c]='Q';
            solve(grid,row+1,c,n);
            grid[row][c]='0';
        }
    }

    }
    boolean ispossible(char grid[][],int row,int c)
    {
        //check for up 
        int r=row;
        int column=c;
        while(r>=0)
        {
            if(grid[r][column]=='Q')
            {
                return false;
            }
            r--;
        }
        r=row;
        column=c;
        //check for right 
        while(r>=0 && column<=grid.length-1)
        {
            if(grid[r][column]=='Q')
            {
                return false;
            }
            r--;
            column++;

        }
        r=row;
        column=c;
        //check for left
        while(r>=0 && column>=0)
        {
            if(grid[r][column]=='Q')
            {
                return false;
            }
            r--;
            column--;
        }
        return true;
    }
}
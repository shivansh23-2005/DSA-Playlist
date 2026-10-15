// LeetCode Problem: Sudoku Solver
// Link: https://leetcode.com/problems/sudoku-solver/
// Difficulty: Hard
// Language: java

class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);   
    }
    public boolean solve(char board[][],int row,int col)
    {
        if(col==9)
        {
            row++;
            col=0;
        }
        if(row==9)
        {
            return true;
        }
        if(board[row][col]!='.')
        {
            return solve(board,row,col+1);
        }
        for(char val='1';val<='9';val++)
        {
            if(isItsafe(board,row,col,val))
            {
                board[row][col]=val;
                if(solve(board,row,col+1)){
                   return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
        public boolean isItsafe(char board[][],int row,int col,char val)
        {
            //check row
            for(int c=0;c<board[0].length;c++)
            {
                if(board[row][c]==val)
                {
                    return false;
                }
            }
            //check col
            for(int r=0;r<board.length;r++)
            {
                if(board[r][col]==val)
                {
                    return false;
                }
            }
            //check 3x3 matrix
            int r=row-row%3;
            int c=col-col%3;
            for(int i=r;i<r+3;i++)
            {
                for(int j=c;j<c+3;j++)
                {
                    if(board[i][j]==val)
                    {
                        return false;
                    }
                }
            }
             return true;
        } 
    }
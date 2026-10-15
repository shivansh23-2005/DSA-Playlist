// LeetCode Problem: N-Queens
// Link: https://leetcode.com/problems/n-queens/
// Difficulty: Hard
// Language: java

class Solution { 
    public List<List<String>> solveNQueens(int n) { 
        List<List<String>> ans = new ArrayList<>(); 
 
        char grid[][] = new char[n][n]; 
 
        for(int i = 0; i < n; i++) 
        { 
            for(int j = 0; j < n; j++) 
            { 
                grid[i][j] = '.'; 
            } 
        } 
 
        solve(grid, 0, 0, 0, n, ans); 
 
        return ans; 
    } 
 
    void solve(char[][] grid, int row, int col, int count, int n, List<List<String>> ans) 
    { 
        if(row == n) 
        { 
            List<String> list = new ArrayList<>(); 
 
            for(int i = 0; i < n; i++) 
            { 
                list.add(new String(grid[i])); 
            } 
 
            ans.add(list); 
            return; 
        } 
 
        for(int j = 0; j < n; j++) 
        { 
            if(ispossible(grid, row, j)) 
            { 
                grid[row][j]='Q'; 
                solve(grid,row+1,j,count+1,n,ans); 
                grid[row][j]='.'; 
            } 
        } 
    } 
 
    boolean ispossible(char grid[][], int row, int col) 
    { 
        // check upper 
        int r = row; 
        int c=col; 
        while(r >= 0) 
        { 
            if(grid[r][col] == 'Q') 
            { 
                return false; 
            } 
 
            r--; 
        }   
 
        // check right diagonal 
        r=row; 
        c=col; 
        while(r>=0 && c<=grid.length-1) 
        { 
            if(grid[r][c]=='Q') 
            { 
                return false; 
            } 
            r--; 
            c++; 
        } 
        
        // check left diagonal 
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
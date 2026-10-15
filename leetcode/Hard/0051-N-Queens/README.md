# N-Queens

**Difficulty:** Hard  
**Topics:** Array, Backtracking, Algorithm X  
**LeetCode URL:** [N-Queens](https://leetcode.com/problems/n-queens/)

## Problem Description

<p>The <strong>n-queens</strong> puzzle is the problem of placing <code>n</code> queens on an <code>n x n</code> chessboard such that no two queens attack each other.</p>

<p>Given an integer <code>n</code>, return <em>all distinct solutions to the <strong>n-queens puzzle</strong></em>. You may return the answer in <strong>any order</strong>.</p>

<p>Each solution contains a distinct board configuration of the n-queens&#39; placement, where <code>&#39;Q&#39;</code> and <code>&#39;.&#39;</code> both indicate a queen and an empty space, respectively.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/queens.jpg" style="width: 600px; height: 268px;" />
<pre>
<strong>Input:</strong> n = 4
<strong>Output:</strong> [[&quot;.Q..&quot;,&quot;...Q&quot;,&quot;Q...&quot;,&quot;..Q.&quot;],[&quot;..Q.&quot;,&quot;Q...&quot;,&quot;...Q&quot;,&quot;.Q..&quot;]]
<strong>Explanation:</strong> There exist two distinct solutions to the 4-queens puzzle as shown above
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 1
<strong>Output:</strong> [[&quot;Q&quot;]]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 9</code></li>
</ul>

## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

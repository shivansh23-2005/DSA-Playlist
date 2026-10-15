# N-Queens II

**Difficulty:** Hard  
**Topics:** Backtracking, Algorithm X  
**LeetCode URL:** [N-Queens II](https://leetcode.com/problems/n-queens-ii/)

## Problem Description

<p>The <strong>n-queens</strong> puzzle is the problem of placing <code>n</code> queens on an <code>n x n</code> chessboard such that no two queens attack each other.</p>

<p>Given an integer <code>n</code>, return <em>the number of distinct solutions to the&nbsp;<strong>n-queens puzzle</strong></em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/queens.jpg" style="width: 600px; height: 268px;" />
<pre>
<strong>Input:</strong> n = 4
<strong>Output:</strong> 2
<strong>Explanation:</strong> There are two distinct solutions to the 4-queens puzzle as shown.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 1
<strong>Output:</strong> 1
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 9</code></li>
</ul>

## Solution

```java
// LeetCode Problem: N-Queens II
// Link: https://leetcode.com/problems/n-queens-ii/
// Difficulty: Hard
// Language: java

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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

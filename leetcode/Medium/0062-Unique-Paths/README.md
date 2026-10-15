# Unique Paths

**Difficulty:** Medium  
**Topics:** Math, Dynamic Programming, Combinatorics  
**LeetCode URL:** [Unique Paths](https://leetcode.com/problems/unique-paths/)

## Problem Description

<p>There is a robot on an <code>m x n</code> grid. The robot is initially located at the <strong>top-left corner</strong> (i.e., <code>grid[0][0]</code>). The robot tries to move to the <strong>bottom-right corner</strong> (i.e., <code>grid[m - 1][n - 1]</code>). The robot can only move either down or right at any point in time.</p>

<p>Given the two integers <code>m</code> and <code>n</code>, return <em>the number of possible unique paths that the robot can take to reach the bottom-right corner</em>.</p>

<p>The test cases are generated so that the answer will be less than or equal to <code>2 * 10<sup>9</sup></code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img src="https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png" style="width: 400px; height: 183px;" />
<pre>
<strong>Input:</strong> m = 3, n = 7
<strong>Output:</strong> 28
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> m = 3, n = 2
<strong>Output:</strong> 3
<strong>Explanation:</strong> From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -&gt; Down -&gt; Down
2. Down -&gt; Down -&gt; Right
3. Down -&gt; Right -&gt; Down
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= m, n &lt;= 100</code></li>
</ul>

## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

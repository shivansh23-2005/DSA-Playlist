# Minimum Path Sum

**Difficulty:** Medium  
**Topics:** Array, Dynamic Programming, Matrix  
**LeetCode URL:** [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/)

## Problem Description

<p>Given a <code>m x n</code> <code>grid</code> filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.</p>

<p><strong>Note:</strong> You can only move either down or right at any point in time.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/minpath.jpg" style="width: 242px; height: 242px;" />
<pre>
<strong>Input:</strong> grid = [[1,3,1],[1,5,1],[4,2,1]]
<strong>Output:</strong> 7
<strong>Explanation:</strong> Because the path 1 &rarr; 3 &rarr; 1 &rarr; 1 &rarr; 1 minimizes the sum.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> grid = [[1,2,3],[4,5,6]]
<strong>Output:</strong> 12
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == grid.length</code></li>
	<li><code>n == grid[i].length</code></li>
	<li><code>1 &lt;= m, n &lt;= 200</code></li>
	<li><code>0 &lt;= grid[i][j] &lt;= 200</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Minimum Path Sum
// Link: https://leetcode.com/problems/minimum-path-sum/
// Difficulty: Medium
// Language: java

class Solution {
public int minPathSum(int[][] grid) {
int dp[][] = new int[grid.length][grid[0].length];


    for (int a[] : dp) {
        Arrays.fill(a, -1);
    }

    return solve(grid, 0, 0, dp);
}

public static int solve(int grid[][], int sr, int sc, int dp[][]) {
    if (sr >= grid.length || sc >= grid[0].length) {
        return Integer.MAX_VALUE;
    }

    if (sr == grid.length - 1 && sc == grid[0].length - 1) {
        return grid[sr][sc];
    }

    if (dp[sr][sc] != -1) {
        return dp[sr][sc];
    }

    int a = solve(grid, sr + 1, sc, dp);
    int b = solve(grid, sr, sc + 1, dp);

    return dp[sr][sc] = grid[sr][sc] + Math.min(a, b);
}


}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

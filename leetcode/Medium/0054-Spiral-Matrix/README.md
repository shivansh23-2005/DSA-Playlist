# Spiral Matrix

**Difficulty:** Medium  
**Topics:** Array, Matrix, Simulation  
**LeetCode URL:** [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)

## Problem Description

<p>Given an <code>m x n</code> <code>matrix</code>, return <em>all elements of the</em> <code>matrix</code> <em>in spiral order</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiral1.jpg" style="width: 242px; height: 242px;" />
<pre>
<strong>Input:</strong> matrix = [[1,2,3],[4,5,6],[7,8,9]]
<strong>Output:</strong> [1,2,3,6,9,8,7,4,5]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiral.jpg" style="width: 322px; height: 242px;" />
<pre>
<strong>Input:</strong> matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
<strong>Output:</strong> [1,2,3,4,8,12,11,10,9,5,6,7]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == matrix.length</code></li>
	<li><code>n == matrix[i].length</code></li>
	<li><code>1 &lt;= m, n &lt;= 10</code></li>
	<li><code>-100 &lt;= matrix[i][j] &lt;= 100</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Spiral Matrix
// Link: https://leetcode.com/problems/spiral-matrix/
// Difficulty: Medium
// Language: java

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>result=new ArrayList<>();
        int top=0;
        int right=matrix[0].length-1;
        int left=0;
        int buttom=matrix.length-1;
        while(top <= buttom && left <= right){
        for(int i=left;i<=right;i++)
        {
            result.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=buttom;i++)
        {
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=buttom){
        for(int i=right;i>=left;i--)
        {
            result.add(matrix[buttom][i]);
        }
        buttom--;
        }
        if(left<=right){
        for(int i=buttom;i>=top;i--)
        {
            result.add(matrix[i][left]);
        }
        left++;
        }
    }
    return result;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

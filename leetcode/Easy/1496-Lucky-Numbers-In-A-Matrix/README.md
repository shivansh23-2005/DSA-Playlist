# Lucky Numbers in a Matrix

**Difficulty:** Easy  
**Topics:** Array, Matrix  
**LeetCode URL:** [Lucky Numbers in a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)

## Problem Description

<p>Given an <code>m x n</code> matrix of <strong>distinct </strong>numbers, return <em>all <strong>lucky numbers</strong> in the matrix in <strong>any </strong>order</em>.</p>

<p>A <strong>lucky number</strong> is an element of the matrix such that it is the minimum element in its row and maximum in its column.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> matrix = [[3,7,8],[9,11,13],[15,16,17]]
<strong>Output:</strong> [15]
<strong>Explanation:</strong> 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
<strong>Output:</strong> [12]
<strong>Explanation:</strong> 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> matrix = [[7,8],[1,2]]
<strong>Output:</strong> [7]
<strong>Explanation:</strong> 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == mat.length</code></li>
	<li><code>n == mat[i].length</code></li>
	<li><code>1 &lt;= n, m &lt;= 50</code></li>
	<li><code>1 &lt;= matrix[i][j] &lt;= 10<sup>5</sup></code>.</li>
	<li>All elements in the matrix are distinct.</li>
</ul>

## Solution

```java
// LeetCode Problem: Lucky Numbers in a Matrix
// Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int row[]=new int[matrix.length];
        int column[]=new int[matrix[0].length];
        
          for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            row[i] = min;
        }
         for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            column[j] = max;
        }

        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<column.length;j++)
            {
            if(row[i]==column[j])
            {
                list.add(row[i]);
            }
            }
        }
        return list;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

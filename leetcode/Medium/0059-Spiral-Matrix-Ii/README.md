# Spiral Matrix II

**Difficulty:** Medium  
**Topics:** Array, Matrix, Simulation  
**LeetCode URL:** [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/)

## Problem Description

<p>Given a positive integer <code>n</code>, generate an <code>n x n</code> <code>matrix</code> filled with elements from <code>1</code> to <code>n<sup>2</sup></code> in spiral order.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiraln.jpg" style="width: 242px; height: 242px;" />
<pre>
<strong>Input:</strong> n = 3
<strong>Output:</strong> [[1,2,3],[8,9,4],[7,6,5]]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 1
<strong>Output:</strong> [[1]]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 20</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Spiral Matrix II
// Link: https://leetcode.com/problems/spiral-matrix-ii/
// Difficulty: Medium
// Language: java

class Solution {

    public int[][] generateMatrix(int n) {

        int num=1;
        int nums[][]=new int[n][n];

        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;

        while(top<=bottom && left<=right)
        {
            if(left<=right){

                int l=left;

                while(l<=right)
                {
                    nums[top][l]=num;
                    l++;
                    num++;
                }

                top++;

                int r=top;

                while(r<=bottom)
                {
                    nums[r][right]=num;
                    num++;
                    r++;
                }

                right--;
            }

            if(top<=bottom){

                int r=right;

                while(r>=left)
                {
                    nums[bottom][r]=num;
                    num++;
                    r--;
                }

                bottom--;

                int b=bottom;

                while(b>=top)
                {
                    nums[b][left]=num;
                    num++;
                    b--;
                }

                left++;
            }
        }

        return nums;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

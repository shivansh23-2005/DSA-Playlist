# Angles of a Triangle

**Difficulty:** Medium  
**Topics:** Array, Math, Geometry  
**LeetCode URL:** [Angles of a Triangle](https://leetcode.com/problems/angles-of-a-triangle/)

## Problem Description

<p>You are given a positive integer array <code>sides</code> of length 3.</p>

<p>Determine if there exists a triangle with <strong>positive</strong> area whose three side lengths are given by the elements of <code>sides</code>.</p>

<p>If such a triangle exists, return an array of three floating-point numbers representing its internal angles (in <strong>degrees</strong>), <strong>sorted</strong> in <strong>non-decreasing</strong> order. Otherwise, return an empty array.</p>

<p>Answers within <code>10<sup>-5</sup></code> of the actual answer will be accepted.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">sides = [3,4,5]</span></p>

<p><strong>Output:</strong> <span class="example-io">[36.86990,53.13010,90.00000]</span></p>

<p><strong>Explanation:</strong></p>

<p>You can form a right-angled triangle with side lengths 3, 4, and 5. The internal angles of this triangle are approximately 36.869897646, 53.130102354, and 90 degrees respectively.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">sides = [2,4,2]</span></p>

<p><strong>Output:</strong> <span class="example-io">[]</span></p>

<p><strong>Explanation:</strong></p>

<p>You cannot form a triangle with positive area using side lengths 2, 4, and 2.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>sides.length == 3</code></li>
	<li><code>1 &lt;= sides[i] &lt;= 1000</code></li>
</ul>

## Constraints



## Solution

```java
// LeetCode Problem: Angles of a Triangle
// Link: https://leetcode.com/problems/angles-of-a-triangle/
// Difficulty: Medium
// Language: java

class Solution {
    public double[] internalAngles(int[] sides) {
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];
        if(a+b<=c || a+c<=b || b+c<=a)
        {
            return new double[0];
        }
        double cosA=((b*b+c*c-a*a)/(2*b*c));
         double cosB=((a*a+c*c-b*b)/(2*a*c));
         double cosC=((a*a+b*b-c*c)/(2*a*b));
        double A=Math.acos(Math.max(-1.0,Math.min(1.0,cosA)));
         double B=Math.acos(Math.max(-1.0,Math.min(1.0,cosB)));
         double C=Math.acos(Math.max(-1.0,Math.min(1.0,cosC)));
        double redtodeg=180.0/Math.PI;
     double[] result=new double[]
            {
            A *redtodeg,
             B *redtodeg, C*redtodeg,
            };
        Arrays.sort(result);
        return result;
        
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

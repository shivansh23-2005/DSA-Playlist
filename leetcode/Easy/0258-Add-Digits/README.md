# Add Digits

**Difficulty:** Easy  
**Topics:** Math, Simulation, Number Theory  
**LeetCode URL:** [Add Digits](https://leetcode.com/problems/add-digits/)

## Problem Description

<p>Given an integer <code>num</code>, repeatedly add all its digits until the result has only one digit, and return it.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> num = 38
<strong>Output:</strong> 2
<strong>Explanation:</strong> The process is
38 --&gt; 3 + 8 --&gt; 11
11 --&gt; 1 + 1 --&gt; 2 
Since 2 has only one digit, return it.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> num = 0
<strong>Output:</strong> 0
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= num &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Could you do it without any loop/recursion in <code>O(1)</code> runtime?</p>

## Solution

```java
// LeetCode Problem: Add Digits
// Link: https://leetcode.com/problems/add-digits/
// Difficulty: Easy
// Language: java

class Solution {
    public int addDigits(int num) {
        int rem;
        int sum=0;
        if(num<10)
        {
            return num;
        }
            while(num!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(sum>=10)
        {
          return addDigits(sum);   
        }
        return sum;
}
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

# Counting Bits

**Difficulty:** Easy  
**Topics:** Dynamic Programming, Bit Manipulation  
**LeetCode URL:** [Counting Bits](https://leetcode.com/problems/counting-bits/)

## Problem Description

<p>Given an integer <code>n</code>, return <em>an array </em><code>ans</code><em> of length </em><code>n + 1</code><em> such that for each </em><code>i</code><em> </em>(<code>0 &lt;= i &lt;= n</code>)<em>, </em><code>ans[i]</code><em> is the <strong>number of </strong></em><code>1</code><em><strong>&#39;s</strong> in the binary representation of </em><code>i</code>.</p>
Do not solve it with built-in functions (i.e., like <code>__builtin_popcount</code> in C++).
<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 2
<strong>Output:</strong> [0,1,1]
<strong>Explanation:</strong>
0 --&gt; 0
1 --&gt; 1
2 --&gt; 10
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 5
<strong>Output:</strong> [0,1,1,2,1,2]
<strong>Explanation:</strong>
0 --&gt; 0
1 --&gt; 1
2 --&gt; 10
3 --&gt; 11
4 --&gt; 100
5 --&gt; 101
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= n &lt;= 10<sup>5</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong></p>

<ul>
	<li>It is very easy to come up with a solution with a runtime of <code>O(n log n)</code>. Can you do it in linear time <code>O(n)</code> and possibly in a single pass?</li>
</ul>

## Solution

```java
// LeetCode Problem: Counting Bits
// Link: https://leetcode.com/problems/counting-bits/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] countBits(int n) {
        int i=0;
        int count=0;
        int  result[]=new int[n+1];
        while(i<=n)
        {
            String str=Integer.toBinaryString(i);
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)=='1')
                {
                    count++;
                }
                result[i]=count;
            }
            count=0;
            i++;
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

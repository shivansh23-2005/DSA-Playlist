# Base 7

**Difficulty:** Easy  
**Topics:** Math, String  
**LeetCode URL:** [Base 7](https://leetcode.com/problems/base-7/)

## Problem Description

<p>Given an integer <code>num</code>, return <em>a string of its <strong>base 7</strong> representation</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> num = 100
<strong>Output:</strong> "202"
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> num = -7
<strong>Output:</strong> "-10"
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-10<sup>7</sup> &lt;= num &lt;= 10<sup>7</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Base 7
// Link: https://leetcode.com/problems/base-7/
// Difficulty: Easy
// Language: java

class Solution {
    public String convertToBase7(int num) {
        String base7 = Integer.toString(num, 7);
        return base7;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

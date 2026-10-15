# Jewels and Stones

**Difficulty:** Easy  
**Topics:** Hash Table, String  
**LeetCode URL:** [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/)

## Problem Description

<p>You&#39;re given strings <code>jewels</code> representing the types of stones that are jewels, and <code>stones</code> representing the stones you have. Each character in <code>stones</code> is a type of stone you have. You want to know how many of the stones you have are also jewels.</p>

<p>Letters are case sensitive, so <code>&quot;a&quot;</code> is considered a different type of stone from <code>&quot;A&quot;</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> jewels = "aA", stones = "aAAbbbb"
<strong>Output:</strong> 3
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> jewels = "z", stones = "ZZ"
<strong>Output:</strong> 0
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;=&nbsp;jewels.length, stones.length &lt;= 50</code></li>
	<li><code>jewels</code> and <code>stones</code> consist of only English letters.</li>
	<li>All the characters of&nbsp;<code>jewels</code> are <strong>unique</strong>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Jewels and Stones
// Link: https://leetcode.com/problems/jewels-and-stones/
// Difficulty: Easy
// Language: java

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int k=0;
        int count=0;
        while(k<jewels.length())
        {
        for(int i=0;i<stones.length();i++)
        {
            char ch=jewels.charAt(k);
            char chstones=stones.charAt(i);
            if(ch==chstones)
            {
                count++;
            }
        }
        k++;
        }
        return count;
        
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

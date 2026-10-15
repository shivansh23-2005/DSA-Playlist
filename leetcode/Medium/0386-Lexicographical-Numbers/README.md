# Lexicographical Numbers

**Difficulty:** Medium  
**Topics:** Depth-First Search, Trie  
**LeetCode URL:** [Lexicographical Numbers](https://leetcode.com/problems/lexicographical-numbers/)

## Problem Description

<p>Given an integer <code>n</code>, return all the numbers in the range <code>[1, n]</code> sorted in lexicographical order.</p>

<p>You must write an algorithm that runs in&nbsp;<code>O(n)</code>&nbsp;time and uses <code>O(1)</code> extra space.&nbsp;</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> n = 13
<strong>Output:</strong> [1,10,11,12,13,2,3,4,5,6,7,8,9]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> n = 2
<strong>Output:</strong> [1,2]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 5 * 10<sup>4</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Lexicographical Numbers
// Link: https://leetcode.com/problems/lexicographical-numbers/
// Difficulty: Medium
// Language: java

class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            solve(n,i,list);
        }
        return list;
    }
    void solve(int n,int curr,List<Integer>list)
    {
        if(curr>n)
        {
            return;
        }
        list.add(curr);
        for(int i=0;i<=9;i++)
        {
            solve(n,curr*10+i,list);
        }

    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

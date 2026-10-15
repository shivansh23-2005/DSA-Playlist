# Generate Parentheses

**Difficulty:** Medium  
**Topics:** String, Dynamic Programming, Backtracking, Bracket Sequences  
**LeetCode URL:** [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)

## Problem Description

<p>Given <code>n</code> pairs of parentheses, write a function to <em>generate all combinations of well-formed parentheses</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> n = 3
<strong>Output:</strong> ["((()))","(()())","(())()","()(())","()()()"]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> n = 1
<strong>Output:</strong> ["()"]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 8</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Generate Parentheses
// Link: https://leetcode.com/problems/generate-parentheses/
// Difficulty: Medium
// Language: java

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        solve(n,0,0,"",list);
        return list;
        
    }
    public void solve(int n,int open,int close,String ans,List<String>list)
    {
        // base case
        if(open==n && close==n)
        {
            list.add(ans);
            return;
        }
        //open 
        if(open<n){
        solve(n,open+1,close,ans+"(",list);
        }
        //close
        if(close<open){
        solve(n,open,close+1,ans+")",list);
        }
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

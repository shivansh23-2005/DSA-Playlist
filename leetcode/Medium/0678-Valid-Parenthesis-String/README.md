# Valid Parenthesis String

**Difficulty:** Medium  
**Topics:** String, Dynamic Programming, Stack, Greedy, Bracket Sequences  
**LeetCode URL:** [Valid Parenthesis String](https://leetcode.com/problems/valid-parenthesis-string/)

## Problem Description

<p>Given a string <code>s</code> containing only three types of characters: <code>&#39;(&#39;</code>, <code>&#39;)&#39;</code> and <code>&#39;*&#39;</code>, return <code>true</code> <em>if</em> <code>s</code> <em>is <strong>valid</strong></em>.</p>

<p>The following rules define a <strong>valid</strong> string:</p>

<ul>
	<li>Any left parenthesis <code>&#39;(&#39;</code> must have a corresponding right parenthesis <code>&#39;)&#39;</code>.</li>
	<li>Any right parenthesis <code>&#39;)&#39;</code> must have a corresponding left parenthesis <code>&#39;(&#39;</code>.</li>
	<li>Left parenthesis <code>&#39;(&#39;</code> must go before the corresponding right parenthesis <code>&#39;)&#39;</code>.</li>
	<li><code>&#39;*&#39;</code> could be treated as a single right parenthesis <code>&#39;)&#39;</code> or a single left parenthesis <code>&#39;(&#39;</code> or an empty string <code>&quot;&quot;</code>.</li>
</ul>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;()&quot;
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;(*)&quot;
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;(*))&quot;
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 4:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;(&quot;
<strong>Output:</strong> false
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>s[i]</code> is <code>&#39;(&#39;</code>, <code>&#39;)&#39;</code> or <code>&#39;*&#39;</code>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Valid Parenthesis String
// Link: https://leetcode.com/problems/valid-parenthesis-string/
// Difficulty: Medium
// Language: java

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>open=new Stack();
        Stack<Integer>astrick=new Stack();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                open.push(i);
            }
            else if(ch=='*')
            {
                astrick.push(i);
            }
            else
            {
                if(!open.isEmpty())
                {
                    open.pop();
                }
                else if(!astrick.isEmpty())
                {
                    astrick.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        while(!open.isEmpty() && !astrick.isEmpty())
        {
            if(open.pop()>astrick.pop())
            {
                return false;
            }
        }
        return open.isEmpty();
        
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

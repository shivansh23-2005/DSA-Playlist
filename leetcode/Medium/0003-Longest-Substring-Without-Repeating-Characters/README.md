# Longest Substring Without Repeating Characters

**Difficulty:** Medium  
**Topics:** Hash Table, String, Sliding Window  
**LeetCode URL:** [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## Problem Description

<p>Given a string <code>s</code>, find the length of the <strong>longest</strong> <span data-keyword="substring-nonempty"><strong>substring</strong></span> without duplicate characters.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abcabcbb&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;abc&quot;, with the length of 3. Note that <code>&quot;bca&quot;</code> and <code>&quot;cab&quot;</code> are also correct answers.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;bbbbb&quot;
<strong>Output:</strong> 1
<strong>Explanation:</strong> The answer is &quot;b&quot;, with the length of 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;pwwkew&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;wke&quot;, with the length of 3.
Notice that the answer must be a substring, &quot;pwke&quot; is a subsequence and not a substring.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
</ul>

## Solution

```java
// LeetCode Problem: Longest Substring Without Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Difficulty: Medium
// Language: java

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int ei=0;
        int si=0;
        int max=0;
        while(ei<s.length())
        {
             while(set.contains(s.charAt(ei)) && si<s.length())
            {
                 set.remove(s.charAt(si));
                 si++;
            }
            set.add(s.charAt(ei));
            max=Math.max(max,ei-si+1);
            ei++;
        }

        return max;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

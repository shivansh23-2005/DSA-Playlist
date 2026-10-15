# Reverse String

**Difficulty:** Easy  
**Topics:** Two Pointers, String  
**LeetCode URL:** [Reverse String](https://leetcode.com/problems/reverse-string/)

## Problem Description

<p>Write a function that reverses a string. The input string is given as an array of characters <code>s</code>.</p>

<p>You must do this by modifying the input array <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> with <code>O(1)</code> extra memory.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> s = ["h","e","l","l","o"]
<strong>Output:</strong> ["o","l","l","e","h"]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> s = ["H","a","n","n","a","h"]
<strong>Output:</strong> ["h","a","n","n","a","H"]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s[i]</code> is a <a href="https://en.wikipedia.org/wiki/ASCII#Printable_characters" target="_blank">printable ascii character</a>.</li>
</ul>

## Solution

```cpp
// LeetCode Problem: Reverse String
// Link: https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    void reverseString(vector<char>& s) {
        int i = 0, j = s.size() - 1; // Initialize pointers
        while (i < j) {
            // Swap characters
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++; // Move forward
            j--; // Move backward
        }
    }
};

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

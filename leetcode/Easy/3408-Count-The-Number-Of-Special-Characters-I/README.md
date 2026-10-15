# Count the Number of Special Characters I

**Difficulty:** Easy  
**Topics:** Hash Table, String  
**LeetCode URL:** [Count the Number of Special Characters I](https://leetcode.com/problems/count-the-number-of-special-characters-i/)

## Problem Description

<p>You are given a string <code>word</code>. A letter is called <strong>special</strong> if it appears <strong>both</strong> in lowercase and uppercase in <code>word</code>.</p>

<p>Return the number of<em> </em><strong>special</strong> letters in<em> </em><code>word</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">word = &quot;aaAbcBC&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>The special characters in <code>word</code> are <code>&#39;a&#39;</code>, <code>&#39;b&#39;</code>, and <code>&#39;c&#39;</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">word = &quot;abc&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p>No character in <code>word</code> appears in uppercase.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">word = &quot;abBCab&quot;</span></p>

<p><strong>Output:</strong> 1</p>

<p><strong>Explanation:</strong></p>

<p>The only special character in <code>word</code> is <code>&#39;b&#39;</code>.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= word.length &lt;= 50</code></li>
	<li><code>word</code> consists of only lowercase and uppercase English letters.</li>
</ul>

## Constraints



## Solution

```java
// LeetCode Problem: Count the Number of Special Characters I
// Link: https://leetcode.com/problems/count-the-number-of-special-characters-i/
// Difficulty: Easy
// Language: java

class Solution {
    public int numberOfSpecialChars(String word) {

        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();

        for (char ch : word.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                lower.add(ch);
            } else {
                upper.add(Character.toLowerCase(ch));
            }
        }

        int count = 0;

        for (char ch : lower) {
            if (upper.contains(ch)) {
                count++;
            }
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

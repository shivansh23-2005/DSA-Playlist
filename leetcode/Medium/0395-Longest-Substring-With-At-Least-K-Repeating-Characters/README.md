# Longest Substring with At Least K Repeating Characters

**Difficulty:** Medium  
**Topics:** Hash Table, String, Divide and Conquer, Sliding Window  
**LeetCode URL:** [Longest Substring with At Least K Repeating Characters](https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/)

## Problem Description

<p>Given a string <code>s</code> and an integer <code>k</code>, return <em>the length of the longest substring of</em> <code>s</code> <em>such that the frequency of each character in this substring is greater than or equal to</em> <code>k</code>.</p>

<p data-pm-slice="1 1 []">if no such substring exists, return 0.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;aaabb&quot;, k = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> The longest substring is &quot;aaa&quot;, as &#39;a&#39; is repeated 3 times.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;ababbc&quot;, k = 2
<strong>Output:</strong> 5
<strong>Explanation:</strong> The longest substring is &quot;ababb&quot;, as &#39;a&#39; is repeated 2 times and &#39;b&#39; is repeated 3 times.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s</code> consists of only lowercase English letters.</li>
	<li><code>1 &lt;= k &lt;= 10<sup>5</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Longest Substring with At Least K Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
// Difficulty: Medium
// Language: java

class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }

                boolean flag = true;

                for (char c : map.keySet()) {
                    if (map.get(c) < k) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

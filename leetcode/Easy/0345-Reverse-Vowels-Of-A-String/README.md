# Reverse Vowels of a String

**Difficulty:** Easy  
**Topics:** Two Pointers, String  
**LeetCode URL:** [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)

## Problem Description

<p>Given a string <code>s</code>, reverse only all the vowels in the string and return it.</p>

<p>The vowels are <code>&#39;a&#39;</code>, <code>&#39;e&#39;</code>, <code>&#39;i&#39;</code>, <code>&#39;o&#39;</code>, and <code>&#39;u&#39;</code>, and they can appear in both lower and upper cases, more than once.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;IceCreAm&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;AceCreIm&quot;</span></p>

<p><strong>Explanation:</strong></p>

<p>The vowels in <code>s</code> are <code>[&#39;I&#39;, &#39;e&#39;, &#39;e&#39;, &#39;A&#39;]</code>. On reversing the vowels, s becomes <code>&quot;AceCreIm&quot;</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;leetcode&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;leotcede&quot;</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 3 * 10<sup>5</sup></code></li>
	<li><code>s</code> consist of <strong>printable ASCII</strong> characters.</li>
</ul>

## Constraints



## Solution

```cpp
// LeetCode Problem: Reverse Vowels of a String
// Link: https://leetcode.com/problems/reverse-vowels-of-a-string/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    string reverseVowels(string s) {
        int left = 0;
        int right = s.length() - 1;
        char temp;

        while (left < right) {
            // Check for vowels at the left pointer
            if ((s[left] != 'a' && s[left] != 'e' && s[left] != 'i' && 
                 s[left] != 'o' && s[left] != 'u' && 
                 s[left] != 'A' && s[left] != 'E' && 
                 s[left] != 'I' && s[left] != 'O' && 
                 s[left] != 'U')) {
                left++;
            } 
            // Check for vowels at the right pointer
            else if ((s[right] != 'a' && s[right] != 'e' && s[right] != 'i' && 
                       s[right] != 'o' && s[right] != 'u' && 
                       s[right] != 'A' && s[right] != 'E' && 
                       s[right] != 'I' && s[right] != 'O' && 
                       s[right] != 'U')) {
                right--;
            } 
            // Swap vowels
            else {
                temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }

        return s;  
    }
};

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

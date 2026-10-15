# Reverse Only Letters

**Difficulty:** Easy  
**Topics:** Two Pointers, String  
**LeetCode URL:** [Reverse Only Letters](https://leetcode.com/problems/reverse-only-letters/)

## Problem Description

<p>Given a string <code>s</code>, reverse the string according to the following rules:</p>

<ul>
	<li>All the characters that are not English letters remain in the same position.</li>
	<li>All the English letters (lowercase or uppercase) should be reversed.</li>
</ul>

<p>Return <code>s</code><em> after reversing it</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> s = "ab-cd"
<strong>Output:</strong> "dc-ba"
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> s = "a-bC-dEf-ghIj"
<strong>Output:</strong> "j-Ih-gfE-dCba"
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> s = "Test1ng-Leet=code-Q!"
<strong>Output:</strong> "Qedo1ct-eeLg=ntse-T!"
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> consists of characters with ASCII values in the range <code>[33, 122]</code>.</li>
	<li><code>s</code> does not contain <code>&#39;\&quot;&#39;</code> or <code>&#39;\\&#39;</code>.</li>
</ul>

## Solution

```c
// LeetCode Problem: Reverse Only Letters
// Link: https://leetcode.com/problems/reverse-only-letters/
// Difficulty: Easy
// Language: c

char* reverseOnlyLetters(char* s) {
    int i,j;
	char temp;
    int size=strlen(s);
    i=0;
    j=size-1;
    while(i<j)
    {
		if(!isalpha(s[i]))
		{
			i++;
			continue;
		}
		else if(!isalpha(s[j]))
		{
			j--;
			continue;
		}
		else
		{
             temp=s[i];
    		s[i]=s[j];
    		s[j]=temp;
    		i++;
    		j--;
		}
	}
	return s;
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

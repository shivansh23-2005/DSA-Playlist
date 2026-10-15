# Determine if String Halves Are Alike

**Difficulty:** Easy  
**Topics:** String, Counting  
**LeetCode URL:** [Determine if String Halves Are Alike](https://leetcode.com/problems/determine-if-string-halves-are-alike/)

## Problem Description

<p>You are given a string <code>s</code> of even length. Split this string into two halves of equal lengths, and let <code>a</code> be the first half and <code>b</code> be the second half.</p>

<p>Two strings are <strong>alike</strong> if they have the same number of vowels (<code>&#39;a&#39;</code>, <code>&#39;e&#39;</code>, <code>&#39;i&#39;</code>, <code>&#39;o&#39;</code>, <code>&#39;u&#39;</code>, <code>&#39;A&#39;</code>, <code>&#39;E&#39;</code>, <code>&#39;I&#39;</code>, <code>&#39;O&#39;</code>, <code>&#39;U&#39;</code>). Notice that <code>s</code> contains uppercase and lowercase letters.</p>

<p>Return <code>true</code><em> if </em><code>a</code><em> and </em><code>b</code><em> are <strong>alike</strong></em>. Otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;book&quot;
<strong>Output:</strong> true
<strong>Explanation:</strong> a = &quot;b<u>o</u>&quot; and b = &quot;<u>o</u>k&quot;. a has 1 vowel and b has 1 vowel. Therefore, they are alike.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;textbook&quot;
<strong>Output:</strong> false
<strong>Explanation:</strong> a = &quot;t<u>e</u>xt&quot; and b = &quot;b<u>oo</u>k&quot;. a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= s.length &lt;= 1000</code></li>
	<li><code>s.length</code> is even.</li>
	<li><code>s</code> consists of <strong>uppercase and lowercase</strong> letters.</li>
</ul>

## Solution

```java
// LeetCode Problem: Determine if String Halves Are Alike
// Link: https://leetcode.com/problems/determine-if-string-halves-are-alike/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0;
        for(int i=0;i<(s.length()/2);i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
            {
                count++;
            }
        }
        for(int i=(s.length()/2);i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
              if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
            {
                count--;
            }
        }
        if(count==0)
        {
            return true;
        }
        return false;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

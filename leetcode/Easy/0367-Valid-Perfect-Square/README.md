# Valid Perfect Square

**Difficulty:** Easy  
**Topics:** Math, Binary Search  
**LeetCode URL:** [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)

## Problem Description

<p>Given a positive integer num, return <code>true</code> <em>if</em> <code>num</code> <em>is a perfect square or</em> <code>false</code> <em>otherwise</em>.</p>

<p>A <strong>perfect square</strong> is an integer that is the square of an integer. In other words, it is the product of some integer with itself.</p>

<p>You must not use any built-in library function, such as <code>sqrt</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> num = 16
<strong>Output:</strong> true
<strong>Explanation:</strong> We return true because 4 * 4 = 16 and 4 is an integer.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> num = 14
<strong>Output:</strong> false
<strong>Explanation:</strong> We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= num &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

## Solution

```cpp
// LeetCode Problem: Valid Perfect Square
// Link: https://leetcode.com/problems/valid-perfect-square/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==1)  
        {
            return 1;
        }
        long long int low=1,high=num/2;
        while(low<=high)
        {
            long long int mid=low+((high-low)/2);
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid<num)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
};
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

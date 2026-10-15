# Maximum Product of Two Digits

**Difficulty:** Easy  
**Topics:** Math, Sorting  
**LeetCode URL:** [Maximum Product of Two Digits](https://leetcode.com/problems/maximum-product-of-two-digits/)

## Problem Description

<p>You are given a positive integer <code>n</code>.</p>

<p>Return the <strong>maximum</strong> product of any two digits in <code>n</code>.</p>

<p><strong>Note:</strong> You may use the <strong>same</strong> digit twice if it appears more than once in <code>n</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 31</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>The digits of <code>n</code> are <code>[3, 1]</code>.</li>
	<li>The possible products of any two digits are: <code>3 * 1 = 3</code>.</li>
	<li>The maximum product is 3.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 22</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>The digits of <code>n</code> are <code>[2, 2]</code>.</li>
	<li>The possible products of any two digits are: <code>2 * 2 = 4</code>.</li>
	<li>The maximum product is 4.</li>
</ul>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 124</span></p>

<p><strong>Output:</strong> <span class="example-io">8</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>The digits of <code>n</code> are <code>[1, 2, 4]</code>.</li>
	<li>The possible products of any two digits are: <code>1 * 2 = 2</code>, <code>1 * 4 = 4</code>, <code>2 * 4 = 8</code>.</li>
	<li>The maximum product is 8.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>10 &lt;= n &lt;= 10<sup>9</sup></code></li>
</ul>

## Constraints



## Solution

```java
// LeetCode Problem: Maximum Product of Two Digits
// Link: https://leetcode.com/problems/maximum-product-of-two-digits/
// Difficulty: Easy
// Language: java

class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        while(n!=0)
        {
            int rem=n%10;
            list.add(rem);
            n=n/10;
        }
        Collections.sort(list);
        int a=list.get(list.size()-1);
        int b=list.get(list.size()-2);
        int product=a*b;
        return product;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

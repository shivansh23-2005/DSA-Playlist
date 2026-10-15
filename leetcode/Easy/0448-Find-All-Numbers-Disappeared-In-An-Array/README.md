# Find All Numbers Disappeared in an Array

**Difficulty:** Easy  
**Topics:** Array, Hash Table  
**LeetCode URL:** [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)

## Problem Description

<p>Given an array <code>nums</code> of <code>n</code> integers where <code>nums[i]</code> is in the range <code>[1, n]</code>, return <em>an array of all the integers in the range</em> <code>[1, n]</code> <em>that do not appear in</em> <code>nums</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [4,3,2,7,8,2,3,1]
<strong>Output:</strong> [5,6]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [1,1]
<strong>Output:</strong> [2]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= n</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Could you do it without extra space and in <code>O(n)</code> runtime? You may assume the returned list does not count as extra space.</p>

## Solution

```java
// LeetCode Problem: Find All Numbers Disappeared in an Array
// Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>a1=new ArrayList<>();
        int Array[]=new int[nums.length];
        TreeSet<Integer>t1=new TreeSet<>();
        for(int k:nums)
        {
            t1.add(k);
        }
        int j=0;
        for(int i:t1)
        {
            Array[j]+=i;
            j+=1;    
        }
        int l=0;
        for(int q=1;q<nums.length+1;q++)
        {
            if(q==Array[l])
            {
                l++;
            }
            else
            {
                a1.add(q);
            }
        }
 
        return a1;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

# Intersection of Two Arrays

**Difficulty:** Easy  
**Topics:** Array, Hash Table, Two Pointers, Binary Search, Sorting  
**LeetCode URL:** [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)

## Problem Description

<p>Given two integer arrays <code>nums1</code> and <code>nums2</code>, return <em>an array of their <span data-keyword="array-intersection">intersection</span></em>. Each element in the result must be <strong>unique</strong> and you may return the result in <strong>any order</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [1,2,2,1], nums2 = [2,2]
<strong>Output:</strong> [2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [4,9,5], nums2 = [9,4,9,8,4]
<strong>Output:</strong> [9,4]
<strong>Explanation:</strong> [4,9] is also accepted.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums1[i], nums2[i] &lt;= 1000</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Intersection of Two Arrays
// Link: https://leetcode.com/problems/intersection-of-two-arrays/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>a1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    a1.add(nums2[j]);
                    System.out.println(nums2[j]);
                }
            }
        }
        int p=0;
            int a[]=new int[a1.size()];
            for(int k:a1)
            {
                a[p]+=k;
                p+=1;
            }
            return a;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

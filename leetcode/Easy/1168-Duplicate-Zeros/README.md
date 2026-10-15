# Duplicate Zeros

**Difficulty:** Easy  
**Topics:** Array, Two Pointers  
**LeetCode URL:** [Duplicate Zeros](https://leetcode.com/problems/duplicate-zeros/)

## Problem Description

<p>Given a fixed-length integer array <code>arr</code>, duplicate each occurrence of zero, shifting the remaining elements to the right.</p>

<p><strong>Note</strong> that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr = [1,0,2,3,0,4,5,0]
<strong>Output:</strong> [1,0,0,2,3,0,0,4]
<strong>Explanation:</strong> After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr = [1,2,3]
<strong>Output:</strong> [1,2,3]
<strong>Explanation:</strong> After calling your function, the input array is modified to: [1,2,3]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= arr.length &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= arr[i] &lt;= 9</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Duplicate Zeros
// Link: https://leetcode.com/problems/duplicate-zeros/
// Difficulty: Easy
// Language: java

class Solution {
    public void duplicateZeros(int[] arr) {
        int[] nums = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length && j < arr.length; i++) {    
            if (arr[i] == 0) {
                
                if (j < arr.length) {
                    nums[j] = 0;
                }
                if (j + 1 < arr.length) {
                    nums[j + 1] = 0;
                }
                j += 2;
            } else {
               
                if (j < arr.length) {
                    nums[j] = arr[i];
                }
                j++;
            }
        }
        for (int q = 0; q < arr.length; q++) {
            arr[q] = nums[q];
        }
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

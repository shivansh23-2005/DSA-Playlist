# Sort Array By Parity

**Difficulty:** Easy  
**Topics:** Array, Two Pointers, Sorting  
**LeetCode URL:** [Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/)

## Problem Description

<p>Given an integer array <code>nums</code>, move all the even integers at the beginning of the array followed by all the odd integers.</p>

<p>Return <em><strong>any array</strong> that satisfies this condition</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,1,2,4]
<strong>Output:</strong> [2,4,3,1]
<strong>Explanation:</strong> The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0]
<strong>Output:</strong> [0]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 5000</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 5000</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Sort Array By Parity
// Link: https://leetcode.com/problems/sort-array-by-parity/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int array[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++) 
        {
            if(nums[i]%2==0)
            {
                array[j]=nums[i];
                j+=1;

            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                array[j]=nums[i];
                j+=1; 
            }
        }
        return array;
        
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

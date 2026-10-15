# Find Peak Element

**Difficulty:** Medium  
**Topics:** Array, Binary Search  
**LeetCode URL:** [Find Peak Element](https://leetcode.com/problems/find-peak-element/)

## Problem Description

<p>A peak element is an element that is strictly greater than its neighbors.</p>

<p>Given a <strong>0-indexed</strong> integer array <code>nums</code>, find a peak element, and return its index. If the array contains multiple peaks, return the index to <strong>any of the peaks</strong>.</p>

<p>You may imagine that <code>nums[-1] = nums[n] = -&infin;</code>. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.</p>

<p>You must write an algorithm that runs in <code>O(log n)</code> time.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> 3 is a peak element and your function should return the index number 2.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,1,3,5,6,4]
<strong>Output:</strong> 5
<strong>Explanation:</strong> Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
	<li><code>nums[i] != nums[i + 1]</code> for all valid <code>i</code>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Find Peak Element
// Link: https://leetcode.com/problems/find-peak-element/
// Difficulty: Medium
// Language: java

class Solution {
    public int findPeakElement(int[] nums) {
        int low=1;
        int high=nums.length-2;
          if((nums.length)==1) return 0;
          if(nums[0]>nums[1]) return 0;
          if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
              if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1])
                {
                    return mid;
                }
             if(nums[mid]<nums[mid+1])
            {
              
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
       return -1; 
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

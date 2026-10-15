# Split Array Largest Sum

**Difficulty:** Hard  
**Topics:** Array, Binary Search, Dynamic Programming, Greedy, Prefix Sum  
**LeetCode URL:** [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/)

## Problem Description

<p>Given an integer array <code>nums</code> and an integer <code>k</code>, split <code>nums</code> into <code>k</code> non-empty subarrays such that the largest sum of any subarray is <strong>minimized</strong>.</p>

<p>Return <em>the minimized largest sum of the split</em>.</p>

<p>A <strong>subarray</strong> is a contiguous part of the array.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [7,2,5,10,8], k = 2
<strong>Output:</strong> 18
<strong>Explanation:</strong> There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,5], k = 2
<strong>Output:</strong> 9
<strong>Explanation:</strong> There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
	<li><code>1 &lt;= k &lt;= min(50, nums.length)</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Split Array Largest Sum
// Link: https://leetcode.com/problems/split-array-largest-sum/
// Difficulty: Hard
// Language: java

class Solution {
    public int splitArray(int[] arr, int k) {
             if(arr.length<k)
        {
            return -1;
        }
        long low=arr[0];
        long high=0;
        for(int i=0;i<arr.length;i++)
        {
           high+=arr[i];
           low=Math.max(low,arr[i]);
        }
        long ans=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(IsPossible(arr,k,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return (int)ans;
    }
    boolean IsPossible(int []arr,int k,long mid)
    {
        int student=1;
        int readpage=0;
        for(int i=0;i<arr.length;i++)
        {
            if(readpage+arr[i]<=mid)
            {
                readpage+=arr[i];
            }
            else
            {
                student++;
                readpage=arr[i];
            }
            if(student>k)
            {
                return false;
            }
        }
        return true;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

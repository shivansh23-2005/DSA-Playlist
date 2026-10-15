# Find the Smallest Divisor Given a Threshold

**Difficulty:** Medium  
**Topics:** Array, Binary Search  
**LeetCode URL:** [Find the Smallest Divisor Given a Threshold](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/)

## Problem Description

<p>Given an array of integers <code>nums</code> and an integer <code>threshold</code>, we will choose a positive integer <code>divisor</code>, divide all the array by it, and sum the division&#39;s result. Find the <strong>smallest</strong> <code>divisor</code> such that the result mentioned above is less than or equal to <code>threshold</code>.</p>

<p>Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: <code>7/3 = 3</code> and <code>10/2 = 5</code>).</p>

<p>The test cases are generated so&nbsp;that there will be an answer.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,5,9], threshold = 6
<strong>Output:</strong> 5
<strong>Explanation:</strong> We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [44,22,33,11,1], threshold = 5
<strong>Output:</strong> 44
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
	<li><code>nums.length &lt;= threshold &lt;= 10<sup>6</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Find the Smallest Divisor Given a Threshold
// Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
// Difficulty: Medium
// Language: java

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            high=Math.max(high,nums[i]);
        }
        int low=1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(ispossible(nums,mid,threshold))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
        
    }
    Boolean ispossible(int[]nums,int mid,int k)
    {
        long thresold=0;
        for(int i=0;i<nums.length;i++)
        {
             thresold+=(int)(Math.ceil((double)nums[i]/mid));
        }
        if(thresold<=k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

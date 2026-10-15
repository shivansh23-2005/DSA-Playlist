# Most Frequent Even Element

**Difficulty:** Easy  
**Topics:** Array, Hash Table, Counting  
**LeetCode URL:** [Most Frequent Even Element](https://leetcode.com/problems/most-frequent-even-element/)

## Problem Description

<p>Given an integer array <code>nums</code>, return <em>the most frequent even element</em>.</p>

<p>If there is a tie, return the <strong>smallest</strong> one. If there is no such element, return <code>-1</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,2,2,4,4,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [4,4,4,9,2,4]
<strong>Output:</strong> 4
<strong>Explanation:</strong> 4 is the even element appears the most.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [29,47,21,41,13,37,25,7]
<strong>Output:</strong> -1
<strong>Explanation:</strong> There is no even element.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2000</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Most Frequent Even Element
// Link: https://leetcode.com/problems/most-frequent-even-element/
// Difficulty: Easy
// Language: java

class Solution {
    public int mostFrequentEven(int[] nums) {  
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int ans=-1;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getKey()%2==0)
            {
                if(entry.getValue()>max||(entry.getValue() == max && entry.getKey() < ans))
                {
                    max=entry.getValue();
                    ans=entry.getKey();
                }
            }
        }
        return ans;
        
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

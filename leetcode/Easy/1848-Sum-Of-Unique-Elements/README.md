# Sum of Unique Elements

**Difficulty:** Easy  
**Topics:** Array, Hash Table, Counting  
**LeetCode URL:** [Sum of Unique Elements](https://leetcode.com/problems/sum-of-unique-elements/)

## Problem Description

<p>You are given an integer array <code>nums</code>. The unique elements of an array are the elements that appear <strong>exactly once</strong> in the array.</p>

<p>Return <em>the <strong>sum</strong> of all the unique elements of </em><code>nums</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,2]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The unique elements are [1,3], and the sum is 4.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,1,1,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no unique elements, and the sum is 0.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,5]
<strong>Output:</strong> 15
<strong>Explanation:</strong> The unique elements are [1,2,3,4,5], and the sum is 15.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 100</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Sum of Unique Elements
// Link: https://leetcode.com/problems/sum-of-unique-elements/
// Difficulty: Easy
// Language: java

class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        { 
            if(entry.getValue()==1)
            {
                sum+=entry.getKey();
            }

        }
        return sum;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

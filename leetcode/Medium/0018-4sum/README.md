# 4Sum

**Difficulty:** Medium  
**Topics:** Array, Two Pointers, Sorting  
**LeetCode URL:** [4Sum](https://leetcode.com/problems/4sum/)

## Problem Description

<p>Given an array <code>nums</code> of <code>n</code> integers, return <em>an array of all the <strong>unique</strong> quadruplets</em> <code>[nums[a], nums[b], nums[c], nums[d]]</code> such that:</p>

<ul>
	<li><code>0 &lt;= a, b, c, d&nbsp;&lt; n</code></li>
	<li><code>a</code>, <code>b</code>, <code>c</code>, and <code>d</code> are <strong>distinct</strong>.</li>
	<li><code>nums[a] + nums[b] + nums[c] + nums[d] == target</code></li>
</ul>

<p>You may return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,0,-1,0,-2,2], target = 0
<strong>Output:</strong> [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,2,2,2,2], target = 8
<strong>Output:</strong> [[2,2,2,2]]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 200</code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: 4Sum
// Link: https://leetcode.com/problems/4sum/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
            HashMap<Long,Integer>map=new HashMap<>();
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    long fourth=(target-((long)nums[i]+(long)nums[j]+(long)nums[k]));
                    if(map.containsKey(fourth))
                    {
                        List<Integer>list=new ArrayList<>();
                        list.add((int)nums[i]);
                        list.add((int)nums[j]);
                        list.add((int)nums[k]);
                        list.add((int)fourth);
                        Collections.sort(list);
                        set.add(list);
                    } 
                }
                map.put((long)nums[j],j);

            }
        }
        return new ArrayList<>(set); 
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

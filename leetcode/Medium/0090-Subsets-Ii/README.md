# Subsets II

**Difficulty:** Medium  
**Topics:** Array, Backtracking, Bit Manipulation  
**LeetCode URL:** [Subsets II](https://leetcode.com/problems/subsets-ii/)

## Problem Description

<p>Given an integer array <code>nums</code> that may contain duplicates, return <em>all possible</em> <span data-keyword="subset"><em>subsets</em></span><em> (the power set)</em>.</p>

<p>The solution set <strong>must not</strong> contain duplicate subsets. Return the solution in <strong>any order</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,2]
<strong>Output:</strong> [[],[1],[1,2],[1,2,2],[2],[2,2]]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [0]
<strong>Output:</strong> [[],[0]]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10</code></li>
	<li><code>-10 &lt;= nums[i] &lt;= 10</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Subsets II
// Link: https://leetcode.com/problems/subsets-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
         backtrack(nums,0,curr,result);
         return result;
        
    }
     void backtrack(int nums[],int index,List<Integer>curr,List<List<Integer>>result)
     {
        if(!result.contains(curr))
        {
           result.add(new ArrayList<>(curr));
        }
        for(int i=index;i<nums.length;i++)
        {
            curr.add(nums[i]);
            backtrack(nums,i+1,curr,result);
            curr.remove(curr.size()-1);
        }
     }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

# Subsets

**Difficulty:** Medium  
**Topics:** Array, Backtracking, Bit Manipulation  
**LeetCode URL:** [Subsets](https://leetcode.com/problems/subsets/)

## Problem Description

<p>Given an integer array <code>nums</code> of <strong>unique</strong> elements, return <em>all possible</em> <span data-keyword="subset"><em>subsets</em></span> <em>(the power set)</em>.</p>

<p>The solution set <strong>must not</strong> contain duplicate subsets. Return the solution in <strong>any order</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0]
<strong>Output:</strong> [[],[0]]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10</code></li>
	<li><code>-10 &lt;= nums[i] &lt;= 10</code></li>
	<li>All the numbers of&nbsp;<code>nums</code> are <strong>unique</strong>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Subsets
// Link: https://leetcode.com/problems/subsets/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr= new ArrayList<>();
        solve(nums,0,ans,curr);
        return ans;  
    }
    public void solve(int nums[],int i,List<List<Integer>>list, List<Integer>ll)
    {
        //not pick 
        if(i==nums.length)
        {
            list.add(ll);
            return;
        }
        solve(nums,i+1,list,new ArrayList<>(ll));
        int ele=nums[i];
        ll.add(ele);
        solve(nums,i+1,list,new ArrayList<>(ll));

    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

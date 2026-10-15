# Permutations

**Difficulty:** Medium  
**Topics:** Array, Backtracking  
**LeetCode URL:** [Permutations](https://leetcode.com/problems/permutations/)

## Problem Description

<p>Given an array <code>nums</code> of distinct integers, return all the possible <span data-keyword="permutation-array">permutations</span>. You can return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [0,1]
<strong>Output:</strong> [[0,1],[1,0]]
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> nums = [1]
<strong>Output:</strong> [[1]]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 6</code></li>
	<li><code>-10 &lt;= nums[i] &lt;= 10</code></li>
	<li>All the integers of <code>nums</code> are <strong>unique</strong>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Permutations
// Link: https://leetcode.com/problems/permutations/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
          permutation(nums,0,curr,result);
          return result;
    }
    void permutation(int nums[],int index,List<Integer>curr,List<List<Integer>>result)
    {
       if (index == nums.length) {
    result.add(new ArrayList<>(curr));
    return;
}

        for(int i=index;i<nums.length;i++)
        {
             swap(nums, i, index);
            curr.add(nums[index]);
            permutation(nums, index + 1, curr, result);
            curr.remove(curr.size() - 1);
             swap(nums, i, index);
        }
    }
    void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}


}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

# Combination Sum II

**Difficulty:** Medium  
**Topics:** Array, Backtracking  
**LeetCode URL:** [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/)

## Problem Description

<p>Given a collection of candidate numbers (<code>candidates</code>) and a target number (<code>target</code>), find all unique combinations in <code>candidates</code>&nbsp;where the candidate numbers sum to <code>target</code>.</p>

<p>Each number in <code>candidates</code>&nbsp;may only be used <strong>once</strong> in the combination.</p>

<p><strong>Note:</strong>&nbsp;The solution set must not contain duplicate combinations.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> candidates = [10,1,2,7,6,1,5], target = 8
<strong>Output:</strong> 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> candidates = [2,5,2,1,2], target = 5
<strong>Output:</strong> 
[
[1,2,2],
[5]
]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;=&nbsp;candidates.length &lt;= 100</code></li>
	<li><code>1 &lt;=&nbsp;candidates[i] &lt;= 50</code></li>
	<li><code>1 &lt;= target &lt;= 30</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Combination Sum II
// Link: https://leetcode.com/problems/combination-sum-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        solve(nums, 0, target, new ArrayList<>(), ans);

        return ans;
    }

    void solve(int[] nums, int index, int target, List<Integer> list,
               List<List<Integer>> ans) {

        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < nums.length; i++) {

            if(i > index && nums[i] == nums[i - 1]) continue;

            if(nums[i] > target) break;

            list.add(nums[i]);

            solve(nums, i + 1, target - nums[i], list, ans);

            list.remove(list.size() - 1);
        }
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

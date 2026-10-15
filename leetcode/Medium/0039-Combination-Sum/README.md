# Combination Sum

**Difficulty:** Medium  
**Topics:** Array, Backtracking  
**LeetCode URL:** [Combination Sum](https://leetcode.com/problems/combination-sum/)

## Problem Description

<p>Given an array of <strong>distinct</strong> integers <code>candidates</code> and a target integer <code>target</code>, return <em>a list of all <strong>unique combinations</strong> of </em><code>candidates</code><em> where the chosen numbers sum to </em><code>target</code><em>.</em> You may return the combinations in <strong>any order</strong>.</p>

<p>The <strong>same</strong> number may be chosen from <code>candidates</code> an <strong>unlimited number of times</strong>. Two combinations are unique if the <span data-keyword="frequency-array">frequency</span> of at least one of the chosen numbers is different.</p>

<p>The test cases are generated such that the number of unique combinations that sum up to <code>target</code> is less than <code>150</code> combinations for the given input.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> candidates = [2,3,6,7], target = 7
<strong>Output:</strong> [[2,2,3],[7]]
<strong>Explanation:</strong>
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> candidates = [2,3,5], target = 8
<strong>Output:</strong> [[2,2,2,2],[2,3,3],[3,5]]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> candidates = [2], target = 1
<strong>Output:</strong> []
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= candidates.length &lt;= 30</code></li>
	<li><code>2 &lt;= candidates[i] &lt;= 40</code></li>
	<li>All elements of <code>candidates</code> are <strong>distinct</strong>.</li>
	<li><code>1 &lt;= target &lt;= 40</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Combination Sum
// Link: https://leetcode.com/problems/combination-sum/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>>ans=new ArrayList<>();
         List<Integer>list=new ArrayList<>();
         solve(candidates,0,0,target,list,ans);
         return ans;
        
    }
    void solve(int[]candidates,int index,int sum,int target, List<Integer>list,List<List<Integer>>ans)
    {
        if(sum==target)
        {
            ans.add(list);
            return;
        }
        if(sum>target)
        {
            return;
        }
        if(index==candidates.length)
        {
            return;
        }
        list.add(candidates[index]);
        solve(candidates,index,sum+candidates[index],target,new ArrayList<>(list),ans);
        list.remove(list.size()-1);
       solve(candidates,index+1,sum,target,new ArrayList<>(list),ans);

    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

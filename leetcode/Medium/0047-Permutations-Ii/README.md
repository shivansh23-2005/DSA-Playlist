# Permutations II

**Difficulty:** Medium  
**Topics:** Array, Backtracking, Sorting  
**LeetCode URL:** [Permutations II](https://leetcode.com/problems/permutations-ii/)

## Problem Description

<p>Given a collection of numbers, <code>nums</code>,&nbsp;that might contain duplicates, return <em>all possible unique permutations <strong>in any order</strong>.</em></p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,2]
<strong>Output:</strong>
[[1,1,2],
 [1,2,1],
 [2,1,1]]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 8</code></li>
	<li><code>-10 &lt;= nums[i] &lt;= 10</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Permutations II
// Link: https://leetcode.com/problems/permutations-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        HashSet<List<Integer>> unique = new HashSet<>();

        permutation(nums, 0, new ArrayList<>(), unique);

        return new ArrayList<>(unique);
    }

    void permutation(int[] nums, int index,
                     List<Integer> curr,
                     HashSet<List<Integer>> unique) {

        if (index == nums.length) {
            unique.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < nums.length; i++) {

            swap(nums, index, i);

            curr.add(nums[index]);      // add inside loop
             permutation(nums, index + 1, curr, unique);
            curr.remove(curr.size() - 1); // remove inside loop
            swap(nums, index, i); // backtrack
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

# Combinations

**Difficulty:** Medium  
**Topics:** Backtracking  
**LeetCode URL:** [Combinations](https://leetcode.com/problems/combinations/)

## Problem Description

<p>Given two integers <code>n</code> and <code>k</code>, return <em>all possible combinations of</em> <code>k</code> <em>numbers chosen from the range</em> <code>[1, n]</code>.</p>

<p>You may return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 4, k = 2
<strong>Output:</strong> [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
<strong>Explanation:</strong> There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 1, k = 1
<strong>Output:</strong> [[1]]
<strong>Explanation:</strong> There is 1 choose 1 = 1 total combination.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 20</code></li>
	<li><code>1 &lt;= k &lt;= n</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Combinations
// Link: https://leetcode.com/problems/combinations/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(n,1,k,list,ans);
        return ans;
    }
    void solve(int n,int index,int k,List<Integer>list,List<List<Integer>>ans)
    {
           if(list.size()==k)
            {
                ans.add(list);
                return;
            }
        for(int i=index;i<=n;i++)
        {
            //pick 
            list.add(i);
            solve(n,i+1,k,new ArrayList<>(list),ans);
            //not pick 
            list.remove(list.size()-1);
        }
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

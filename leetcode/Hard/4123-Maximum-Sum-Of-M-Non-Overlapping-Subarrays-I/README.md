# Maximum Sum of M Non-Overlapping Subarrays I

**Difficulty:** Hard  
**Topics:** Array, Binary Search, Dynamic Programming, Queue, Sliding Window, Prefix Sum, Monotonic Queue  
**LeetCode URL:** [Maximum Sum of M Non-Overlapping Subarrays I](https://leetcode.com/problems/maximum-sum-of-m-non-overlapping-subarrays-i/)

## Problem Description

<p>You are given an integer array <code>nums</code> of length <code>n</code>, and three integers <code>m</code>, <code>l</code>, and <code>r</code>.</p>

<p>Your task is to select <strong>at least</strong> one and <strong>at most</strong> <code>m</code> <strong>non-overlapping <span data-keyword="subarray-nonempty">subarrays</span></strong> from <code>nums</code> such that:</p>

<ul>
	<li>Each selected <strong>subarray</strong> has a length between <code>[l, r]</code> (inclusive).</li>
	<li>The total sum of all selected <strong>subarrays</strong> is <strong>maximized</strong>.</li>
</ul>

<p>Return the <strong>maximum</strong> total sum you can achieve.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [4,1,-5,2], m = 2, l = 1, r = 3</span></p>

<p><strong>Output:</strong> <span class="example-io">7</span></p>

<p><strong>Explanation:</strong></p>

<p>One optimal strategy is to:</p>

<ul>
	<li>Select the subarray <code>[4, 1]</code> with sum <code>4 + 1 = 5</code> and the subarray <code>[2]</code> with sum 2. Both subarrays have length between <code>[l, r]</code>.</li>
	<li>The total sum of these subarrays is <code>5 + 2 = 7</code>, which is the maximum achievable sum with at most <code>m = 2</code> subarrays.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1,0,3,4], m = 2, l = 1, r = 2</span></p>

<p><strong>Output:</strong> <span class="example-io">8</span></p>

<p><strong>Explanation:</strong></p>

<p>One optimal strategy is to:</p>

<ul>
	<li>Select the subarray <code>[1]</code> with sum <code>1</code> and the subarray <code>[3, 4]</code> with sum <code>3 + 4 = 7</code>. Both subarrays have length between <code>[l, r]</code>.</li>
	<li>The total sum of these subarrays is <code>1 + 7 = 8</code>, which is the maximum achievable sum with at most <code>m = 2</code> subarrays.</li>
</ul>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [-1,7,-4], m = 1, l = 2, r = 3</span></p>

<p><strong>Output:</strong> <span class="example-io">6</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>Select the subarray <code>[-1, 7]</code> from <code>nums</code> which has length between <code>[l, r]</code>.</li>
	<li>The total sum of this subarray is <code>-1 + 7 = 6</code>, which is the maximum achievable sum with at most <code>m = 1</code> subarray.</li>
</ul>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [-3,-4,-1], m = 2, l = 1, r = 2</span></p>

<p><strong>Output:</strong> <span class="example-io">-1</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>All subarrays of <code>nums</code> have negative sums. The optimal strategy is to select the subarray <code>[-1]</code>, which has length between <code>[l, r]</code>.</li>
	<li>The total sum of this subarray is -1, which is the maximum achievable sum with at most <code>m = 2</code> subarrays.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n == nums.length &lt;= 1000</code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup>​​​​​​​</code></li>
	<li><code>1 &lt;= m &lt;= n</code></li>
	<li><code>1 &lt;= l &lt;= r &lt;= n</code></li>
</ul>

## Constraints



## Solution

```java
// LeetCode Problem: Maximum Sum of M Non-Overlapping Subarrays I
// Link: https://leetcode.com/problems/maximum-sum-of-m-non-overlapping-subarrays-i/
// Difficulty: Hard
// Language: java

class Solution {
    public long maximumSum(int[] nums, int m, int l, int r) {
        int n=nums.length;
        long pref[]=new long[n+1];
        for(int i=0;i<n;i++)
            {
                pref[i+1]=pref[i]+nums[i];
            }
        long Neg=Long.MIN_VALUE/4;
        long dp[][]=new long[m+1][n+1];
        for(int i=0;i<=m;i++)
            {
                Arrays.fill(dp[i],Neg);
            }
        for(int j=0;j<=n;j++)
            {
                dp[0][j]=0;
            }
        for(int p=1;p<=m;p++)
            {
                Deque<Integer>dq=new ArrayDeque<>();
                for(int j=1;j<=n;j++)
                    {
                        dp[p][j]=dp[p][j-1];
                        int add=j-l;
                        if(add>=0)
                        {
                            long val=dp[p-1][add]-pref[add];
                            while(!dq.isEmpty())
                                {
                                    int last=dq.peekLast();
                                    if(dp[p-1][last]-pref[last]<=val)
                                        dq.pollLast();
                                    else
                                        break;
                                }
                            dq.offerLast(add);
                        }
                        int remove=j-r-1;
                        while(!dq.isEmpty() && dq.peekFirst()<=remove)
                            {
                                dq.pollFirst();
                            }
                        if(!dq.isEmpty())
                        {
                            int t=dq.peekFirst();
                            dp[p][j]=Math.max(dp[p][j],pref[j]+dp[p-1][t]-pref[t]);
                        }
                    }
            }
        long res=Long.MIN_VALUE;
        for(int k=1;k<=m;k++)
            {
            res=Math.max(res,dp[k][n]);
            }
        return res;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

# Coin Change

**Difficulty:** Medium  
**Topics:** Array, Dynamic Programming, Breadth-First Search, Knapsack Problem, Complete Knapsack  
**LeetCode URL:** [Coin Change](https://leetcode.com/problems/coin-change/)

## Problem Description

<p>You are given an integer array <code>coins</code> representing coins of different denominations and an integer <code>amount</code> representing a total amount of money.</p>

<p>Return the <strong>fewest</strong> number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.</p>

<p>You may assume that you have an infinite number of each kind of coin.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> coins = [1,2,5], amount = 11
<strong>Output:</strong> 3
<strong>Explanation:</strong> 11 = 5 + 5 + 1
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> coins = [2], amount = 3
<strong>Output:</strong> -1
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> coins = [1], amount = 0
<strong>Output:</strong> 0
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= coins.length &lt;= 12</code></li>
	<li><code>1 &lt;= coins[i] &lt;= 2<sup>31</sup> - 1</code></li>
	<li><code>0 &lt;= amount &lt;= 10<sup>4</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Coin Change
// Link: https://leetcode.com/problems/coin-change/
// Difficulty: Medium
// Language: java

class Solution {
public int coinChange(int[] coins, int amount) {
int dp[][] = new int[coins.length][amount + 1];


    for (int[] a : dp) {
        Arrays.fill(a, -1);
    }

    int ans = solve(coins, 0, amount, dp);

    if (ans == Integer.MAX_VALUE) {
        return -1;
    }

    return ans;
}

public static int solve(int[] coins, int index, int amount, int[][] dp) {
    if (amount == 0) {
        return 0;
    }

    if (index >= coins.length) {
        return Integer.MAX_VALUE;
    }

    if (dp[index][amount] != -1) {
        return dp[index][amount];
    }

    int a = Integer.MAX_VALUE;

    if (coins[index] <= amount) {
        int result = solve(coins, index, amount - coins[index], dp);

        if (result != Integer.MAX_VALUE) {
            a = 1 + result;
        }
    }

    int b = solve(coins, index + 1, amount, dp);

    return dp[index][amount] = Math.min(a, b);
}


}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

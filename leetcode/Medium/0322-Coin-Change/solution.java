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

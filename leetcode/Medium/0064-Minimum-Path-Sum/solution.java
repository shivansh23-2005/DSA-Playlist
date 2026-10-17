// LeetCode Problem: Minimum Path Sum
// Link: https://leetcode.com/problems/minimum-path-sum/
// Difficulty: Medium
// Language: java

class Solution {
public int minPathSum(int[][] grid) {
int dp[][] = new int[grid.length][grid[0].length];


    for (int a[] : dp) {
        Arrays.fill(a, -1);
    }

    return solve(grid, 0, 0, dp);
}

public static int solve(int grid[][], int sr, int sc, int dp[][]) {
    if (sr >= grid.length || sc >= grid[0].length) {
        return Integer.MAX_VALUE;
    }

    if (sr == grid.length - 1 && sc == grid[0].length - 1) {
        return grid[sr][sc];
    }

    if (dp[sr][sc] != -1) {
        return dp[sr][sc];
    }

    int a = solve(grid, sr + 1, sc, dp);
    int b = solve(grid, sr, sc + 1, dp);

    return dp[sr][sc] = grid[sr][sc] + Math.min(a, b);
}


}

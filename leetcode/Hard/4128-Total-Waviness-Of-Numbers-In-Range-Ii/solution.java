// LeetCode Problem: Total Waviness of Numbers in Range II
// Link: https://leetcode.com/problems/total-waviness-of-numbers-in-range-ii/
// Difficulty: Hard
// Language: java

class Solution {

    long[][][][] memo;
    char[] digits;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long x) {
        if (x <= 0) return 0;

        digits = String.valueOf(x).toCharArray();
        int n = digits.length;

        memo = new long[n][11][11][n + 1];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < 11; j++)
                for (int k = 0; k < 11; k++)
                    Arrays.fill(memo[i][j][k], -1);

        return dfs(0, 10, 10, 0, true, false);
    }

    private long dfs(int pos, int prev2, int prev1,
                     int waviness, boolean tight, boolean started) {

        if (pos == digits.length) {
            return started ? waviness : 0;
        }

        if (!tight && memo[pos][prev2][prev1][waviness] != -1) {
            return memo[pos][prev2][prev1][waviness];
        }

        int limit = tight ? digits[pos] - '0' : 9;
        long ans = 0;

        for (int d = 0; d <= limit; d++) {

            boolean nextStarted = started || d != 0;
            int add = 0;

            if (!nextStarted) {
                ans += dfs(pos + 1, 10, 10, waviness,
                           tight && d == limit, false);
                continue;
            }

            if (started && prev2 != 10) {
                if ((prev1 > prev2 && prev1 > d) ||
                    (prev1 < prev2 && prev1 < d)) {
                    add = 1;
                }
            }

            int np2 = started ? prev1 : 10;
            int np1 = d;

            ans += dfs(pos + 1, np2, np1,
                       waviness + add,
                       tight && d == limit,
                       true);
        }

        if (!tight) {
            memo[pos][prev2][prev1][waviness] = ans;
        }

        return ans;
    }
}
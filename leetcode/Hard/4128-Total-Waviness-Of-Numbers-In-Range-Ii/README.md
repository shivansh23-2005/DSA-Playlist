# Total Waviness of Numbers in Range II

**Difficulty:** Hard  
**Topics:** Math, Dynamic Programming  
**LeetCode URL:** [Total Waviness of Numbers in Range II](https://leetcode.com/problems/total-waviness-of-numbers-in-range-ii/)

## Problem Description

<p>You are given two integers <code>num1</code> and <code>num2</code> representing an <strong>inclusive</strong> range <code>[num1, num2]</code>.</p>

<p>The <strong>waviness</strong> of a number is defined as the total count of its <strong>peaks</strong> and <strong>valleys</strong>:</p>

<ul>
	<li>A digit is a <strong>peak</strong> if it is <strong>strictly greater</strong> than both of its immediate neighbors.</li>
	<li>A digit is a <strong>valley</strong> if it is <strong>strictly less</strong> than both of its immediate neighbors.</li>
	<li>The first and last digits of a number <strong>cannot</strong> be peaks or valleys.</li>
	<li>Any number with fewer than 3 digits has a waviness of 0.</li>
</ul>
Return the total sum of waviness for all numbers in the range <code>[num1, num2]</code>.
<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">num1 = 120, num2 = 130</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>In the range <code>[120, 130]</code>:</p>

<ul>
	<li><code>120</code>: middle digit 2 is a peak, waviness = 1.</li>
	<li><code>121</code>: middle digit 2 is a peak, waviness = 1.</li>
	<li><code>130</code>: middle digit 3 is a peak, waviness = 1.</li>
	<li>All other numbers in the range have a waviness of 0.</li>
</ul>

<p>Thus, total waviness is <code>1 + 1 + 1 = 3</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">num1 = 198, num2 = 202</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>In the range <code>[198, 202]</code>:</p>

<ul>
	<li><code>198</code>: middle digit 9 is a peak, waviness = 1.</li>
	<li><code>201</code>: middle digit 0 is a valley, waviness = 1.</li>
	<li><code>202</code>: middle digit 0 is a valley, waviness = 1.</li>
	<li>All other numbers in the range have a waviness of 0.</li>
</ul>

<p>Thus, total waviness is <code>1 + 1 + 1 = 3</code>.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">num1 = 4848, num2 = 4848</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<p>Number <code>4848</code>: the second digit 8 is a peak, and the third digit 4 is a valley, giving a waviness of 2.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= num1 &lt;= num2 &lt;= 10<sup>15</sup></code>​​​​​​​</li>
</ul>

## Constraints



## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

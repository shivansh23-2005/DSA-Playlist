// LeetCode Problem: Maximum Total Subarray Value II
// Link: https://leetcode.com/problems/maximum-total-subarray-value-ii/
// Difficulty: Hard
// Language: java

import java.util.*;

class Solution {
    private int[][] stMax;
    private int[][] stMin;
    private int[] log;

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        buildSparseTables(nums);

        PriorityQueue<Node> pq =
            new PriorityQueue<>((a, b) -> Long.compare(b.val, a.val));

        for (int l = 0; l < n; l++) {
            long value = getValue(l, n - 1);
            pq.offer(new Node(value, l, n - 1));
        }

        long ans = 0;

        while (k-- > 0) {
            Node cur = pq.poll();
            ans += cur.val;

            if (cur.r > cur.l) {
                int nr = cur.r - 1;
                pq.offer(new Node(getValue(cur.l, nr), cur.l, nr));
            }
        }

        return ans;
    }

    private void buildSparseTables(int[] nums) {
        int n = nums.length;

        log = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        int K = log[n] + 1;

        stMax = new int[K][n];
        stMin = new int[K][n];

        for (int i = 0; i < n; i++) {
            stMax[0][i] = nums[i];
            stMin[0][i] = nums[i];
        }

        for (int k = 1; k < K; k++) {
            int len = 1 << k;
            int half = len >> 1;

            for (int i = 0; i + len <= n; i++) {
                stMax[k][i] =
                    Math.max(stMax[k - 1][i],
                             stMax[k - 1][i + half]);

                stMin[k][i] =
                    Math.min(stMin[k - 1][i],
                             stMin[k - 1][i + half]);
            }
        }
    }

    private long getValue(int l, int r) {
        int len = r - l + 1;
        int k = log[len];

        int mx = Math.max(
            stMax[k][l],
            stMax[k][r - (1 << k) + 1]
        );

        int mn = Math.min(
            stMin[k][l],
            stMin[k][r - (1 << k) + 1]
        );

        return (long) mx - mn;
    }

    static class Node {
        long val;
        int l, r;

        Node(long val, int l, int r) {
            this.val = val;
            this.l = l;
            this.r = r;
        }
    }
}
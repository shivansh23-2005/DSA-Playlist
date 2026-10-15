// LeetCode Problem: Number of Ways to Assign Edge Weights I
// Link: https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i/
// Difficulty: Medium
// Language: java

import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);

        boolean[] visited = new boolean[n + 1];
        visited[1] = true;

        int depth = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int node = q.poll();

                for (int nei : graph[node]) {
                    if (!visited[nei]) {
                        visited[nei] = true;
                        q.offer(nei);
                    }
                }
            }
            depth++;
        }

        return (int) modPow(2, depth - 2);
    }

    private long modPow(long a, long b) {
        long ans = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                ans = (ans * a) % MOD;
            }

            a = (a * a) % MOD;
            b >>= 1;
        }

        return ans;
    }
}
# Number of Ways to Assign Edge Weights I

**Difficulty:** Medium  
**Topics:** Math, Tree, Depth-First Search  
**LeetCode URL:** [Number of Ways to Assign Edge Weights I](https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i/)

## Problem Description

<p>There is an undirected tree with <code>n</code> nodes labeled from 1 to <code>n</code>, rooted at node 1. The tree is represented by a 2D integer array <code>edges</code> of length <code>n - 1</code>, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates that there is an edge between nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code>.</p>

<p>Initially, all edges have a weight of 0. You must assign each edge a weight of either <strong>1</strong> or <strong>2</strong>.</p>

<p>The <strong>cost</strong> of a path between any two nodes <code>u</code> and <code>v</code> is the total weight of all edges in the path connecting them.</p>

<p>Select any one node <code>x</code> at the <strong>maximum</strong> depth. Return the number of ways to assign edge weights in the path from node 1 to <code>x</code> such that its total cost is <strong>odd</strong>.</p>

<p>Since the answer may be large, return it <strong>modulo</strong> <code>10<sup>9</sup> + 7</code>.</p>

<p><strong>Note:</strong> Ignore all edges <strong>not</strong> in the path from node 1 to <code>x</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<p><img src="https://assets.leetcode.com/uploads/2025/03/23/screenshot-2025-03-24-at-060006.png" style="width: 200px; height: 72px;" /></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">edges = [[1,2]]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>The path from Node 1 to Node 2 consists of one edge (<code>1 &rarr; 2</code>).</li>
	<li>Assigning weight 1 makes the cost odd, while 2 makes it even. Thus, the number of valid assignments is 1.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<p><img src="https://assets.leetcode.com/uploads/2025/03/23/screenshot-2025-03-24-at-055820.png" style="width: 220px; height: 207px;" /></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">edges = [[1,2],[1,3],[3,4],[3,5]]</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>The maximum depth is 2, with nodes 4 and 5 at the same depth. Either node can be selected for processing.</li>
	<li>For example, the path from Node 1 to Node 4 consists of two edges (<code>1 &rarr; 3</code> and <code>3 &rarr; 4</code>).</li>
	<li>Assigning weights (1,2) or (2,1) results in an odd cost. Thus, the number of valid assignments is 2.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>edges.length == n - 1</code></li>
	<li><code>edges[i] == [u<sub>i</sub>, v<sub>i</sub>]</code></li>
	<li><code>1 &lt;= u<sub>i</sub>, v<sub>i</sub> &lt;= n</code></li>
	<li><code>edges</code> represents a valid tree.</li>
</ul>

## Constraints



## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

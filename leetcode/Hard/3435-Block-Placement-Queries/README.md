# Block Placement Queries

**Difficulty:** Hard  
**Topics:** Array, Binary Search, Binary Indexed Tree, Segment Tree, Ordered Set  
**LeetCode URL:** [Block Placement Queries](https://leetcode.com/problems/block-placement-queries/)

## Problem Description

<p>There exists an infinite number line, with its origin at 0 and extending towards the <strong>positive</strong> x-axis.</p>

<p>You are given a 2D array <code>queries</code>, which contains two types of queries:</p>

<ol>
	<li>For a query of type 1, <code>queries[i] = [1, x]</code>. Build an obstacle at distance <code>x</code> from the origin. It is guaranteed that there is <strong>no</strong> obstacle at distance <code>x</code> when the query is asked.</li>
	<li>For a query of type 2, <code>queries[i] = [2, x, sz]</code>. Check if it is possible to place a block of size <code>sz</code> <em>anywhere</em> in the range <code>[0, x]</code> on the line, such that the block <strong>entirely</strong> lies in the range <code>[0, x]</code>. A block <strong>cannot </strong>be placed if it intersects with any obstacle, but it may touch it. Note that you do<strong> not</strong> actually place the block. Queries are separate.</li>
</ol>

<p>Return a boolean array <code>results</code>, where <code>results[i]</code> is <code>true</code> if you can place the block specified in the <code>i<sup>th</sup></code> query of type 2, and <code>false</code> otherwise.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">queries = [[1,2],[2,3,3],[2,3,1],[2,2,2]]</span></p>

<p><strong>Output:</strong> <span class="example-io">[false,true,true]</span></p>

<p><strong>Explanation:</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2024/04/22/example0block.png" style="padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; width: 309px; height: 129px;" /></strong></p>

<p>For query 0, place an obstacle at <code>x = 2</code>. A block of size at most 2 can be placed before <code>x = 3</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">queries = </span>[[1,7],[2,7,6],[1,2],[2,7,5],[2,7,6]]<!-- notionvc: 4a471445-5af1-4d72-b11b-94d351a2c8e9 --></p>

<p><strong>Output:</strong> [true,true,false]</p>

<p><strong>Explanation:</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2024/04/22/example1block.png" style="padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; width: 310px; height: 130px;" /></strong></p>

<ul>
	<li>Place an obstacle at <code>x = 7</code> for query 0. A block of size at most 7 can be placed before <code>x = 7</code>.</li>
	<li>Place an obstacle at <code>x = 2</code> for query 2. Now, a block of size at most 5 can be placed before <code>x = 7</code>, and a block of size at most 2 before <code>x = 2</code>.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= queries.length &lt;= 15 * 10<sup>4</sup></code></li>
	<li><code>2 &lt;= queries[i].length &lt;= 3</code></li>
	<li><code>1 &lt;= queries[i][0] &lt;= 2</code></li>
	<li><code>1 &lt;= x, sz &lt;= min(5 * 10<sup>4</sup>, 3 * queries.length)</code></li>
	<li>The input is generated such that for queries of type 1, no obstacle exists at distance <code>x</code> when the query is asked.</li>
	<li>The input is generated such that there is at least one query of type 2.</li>
</ul>

## Constraints



## Solution

```java
// LeetCode Problem: Block Placement Queries
// Link: https://leetcode.com/problems/block-placement-queries/
// Difficulty: Hard
// Language: java

class Solution {

    class SegTree {
        int n;
        int[] tree;

        SegTree(int n) {
            this.n = n;
            tree = new int[4 * n];
        }

        void update(int idx, int val) {
            update(1, 0, n - 1, idx, val);
        }

        private void update(int node, int l, int r, int idx, int val) {
            if (l == r) {
                tree[node] = val;
                return;
            }

            int mid = (l + r) / 2;

            if (idx <= mid)
                update(node * 2, l, mid, idx, val);
            else
                update(node * 2 + 1, mid + 1, r, idx, val);

            tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
        }

        int query(int L, int R) {
            return query(1, 0, n - 1, L, R);
        }

        private int query(int node, int l, int r, int L, int R) {
            if (R < l || r < L) return 0;

            if (L <= l && r <= R)
                return tree[node];

            int mid = (l + r) / 2;

            return Math.max(
                query(node * 2, l, mid, L, R),
                query(node * 2 + 1, mid + 1, r, L, R)
            );
        }
    }

    public List<Boolean> getResults(int[][] queries) {

        int MX = 50000;

        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        set.add(MX);

        SegTree seg = new SegTree(MX + 1);

        seg.update(MX, MX);

        List<Boolean> ans = new ArrayList<>();

        for (int[] q : queries) {

            if (q[0] == 1) {

                int x = q[1];

                int right = set.ceiling(x);
                int left = set.floor(x);

                seg.update(x, x - left);
                seg.update(right, right - x);

                set.add(x);

            } else {

                int x = q[1];
                int sz = q[2];

                int prev = set.floor(x);

                int best = seg.query(0, prev);

                boolean ok = best >= sz ||
                             (x - prev) >= sz;

                ans.add(ok);
            }
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

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
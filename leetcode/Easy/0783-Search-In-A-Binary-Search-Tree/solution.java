// LeetCode Problem: Search in a Binary Search Tree
// Link: https://leetcode.com/problems/search-in-a-binary-search-tree/
// Difficulty: Easy
// Language: java

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;

        if (val < root.val)
            return searchBST(root.left, val);

        return searchBST(root.right, val);
    }
}
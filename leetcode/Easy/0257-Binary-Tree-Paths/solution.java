// LeetCode Problem: Binary Tree Paths
// Link: https://leetcode.com/problems/binary-tree-paths/
// Difficulty: Easy
// Language: java

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList<>();
        traversal(root, "", result);
        return result;
    }

    void traversal(TreeNode root, String path, ArrayList<String> result) {
        if (root == null) return;

        if (path.length() == 0) {
            path = "" + root.val;
        } else {
            path = path + "->" + root.val;
        }

        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        traversal(root.left, path, result);
        traversal(root.right, path, result);
    }
}
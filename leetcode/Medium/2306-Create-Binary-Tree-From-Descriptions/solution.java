// LeetCode Problem: Create Binary Tree From Descriptions
// Link: https://leetcode.com/problems/create-binary-tree-from-descriptions/
// Difficulty: Medium
// Language: java

import java.util.*;

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for (int[] d : descriptions) {
            int parent = d[0];
            int child = d[1];
            int isLeft = d[2];

            map.putIfAbsent(parent, new TreeNode(parent));
            map.putIfAbsent(child, new TreeNode(child));

            if (isLeft == 1) {
                map.get(parent).left = map.get(child);
            } else {
                map.get(parent).right = map.get(child);
            }

            children.add(child);
        }

        TreeNode root = null;

        for (int[] d : descriptions) {
            if (!children.contains(d[0])) {
                root = map.get(d[0]);
                break;
            }
        }

        return root;
    }
}
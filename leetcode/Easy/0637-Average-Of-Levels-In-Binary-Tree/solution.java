// LeetCode Problem: Average of Levels in Binary Tree
// Link: https://leetcode.com/problems/average-of-levels-in-binary-tree/
// Difficulty: Easy
// Language: java


 class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        List<TreeNode> level = new ArrayList<>();

        level.add(root);

        while (!level.isEmpty()) {

            double sum = 0;

            for (TreeNode node : level) {
                sum += node.val;
            }

            result.add(sum / level.size());

            List<TreeNode> next = new ArrayList<>();

            for (TreeNode node : level) {
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
            }

            level = next;
        }
        
        return result; 
    }
 }
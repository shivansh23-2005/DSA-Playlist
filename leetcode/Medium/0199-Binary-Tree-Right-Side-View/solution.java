// LeetCode Problem: Binary Tree Right Side View
// Link: https://leetcode.com/problems/binary-tree-right-side-view/
// Difficulty: Medium
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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
           List<Integer>ans=new ArrayList<>();
           if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                  list.add(node.val);
                if(node.left!=null)
                {

                   q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
            ans.add(list.get(list.size()-1));
        }
         return ans;
    }
}
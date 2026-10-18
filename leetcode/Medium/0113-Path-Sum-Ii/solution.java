// LeetCode Problem: Path Sum II
// Link: https://leetcode.com/problems/path-sum-ii/
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        List<Integer>list=new ArrayList<>();
        solve(root,0,targetSum,list,ans);
        return ans;
    }
    public static void solve(TreeNode root,int csum,int target,List<Integer>list, List<List<Integer>>ans){
        if(root==null) return;
        csum+=root.val;
           list.add(root.val);
        if(root.left==null && root.right==null)
        {
            if(csum==target)
            {
                ans.add(list);
                return;
            }
            else
            {
                list.remove(list.size()-1);
            }
        }
        if(root.left!=null)
        solve(root.left,csum,target,new ArrayList<>(list),ans);
        if(root.right!=null)
        solve(root.right,csum,target,new ArrayList<>(list),ans);
    }
}
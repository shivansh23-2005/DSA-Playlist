// LeetCode Problem: Invert Binary Tree
// Link: https://leetcode.com/problems/invert-binary-tree/
// Difficulty: Easy
// Language: cpp

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        if(root==NULL)
        return 0; 
        swap(root->left,root->right);
        invertTree(root->left);
        invertTree(root->right);
        return root;  
    }
};
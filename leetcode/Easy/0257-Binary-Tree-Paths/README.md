# Binary Tree Paths

**Difficulty:** Easy  
**Topics:** String, Backtracking, Tree, Depth-First Search, Binary Tree  
**LeetCode URL:** [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)

## Problem Description

<p>You are given the <code>root</code> of a binary tree.</p>

<p>Return all <strong>root-to-leaf</strong> paths<em> </em>in <strong>any order</strong>.</p>

<p>A <strong>leaf</strong> is a node with no children.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/12/paths-tree.jpg" style="width: 207px; height: 293px;" />
<pre>
<strong>Input:</strong> root = [1,2,3,null,5]
<strong>Output:</strong> [&quot;1-&gt;2-&gt;5&quot;,&quot;1-&gt;3&quot;]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> [&quot;1&quot;]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 100]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>

## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>

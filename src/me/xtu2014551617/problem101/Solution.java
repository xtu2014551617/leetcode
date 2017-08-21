package me.xtu2014551617.problem101;

/**
 * Created by xtu2014551617 on 17/8/21.
 * @see <a href="https://leetcode.com/problems/symmetric-tree/description/">
 *  101. Symmetric Tree</a>
 * 判断一棵树是否对称
 * 深度优先遍历，一边左节点优先，一边右节点优先。若值一直是相等的，则说明这颗树是对称的。
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            return dfs(root.left, root.right);
        }
        return true;
    }

    private static boolean dfs(TreeNode l, TreeNode r) {

        if (l == null && r == null) {
            return true;
        }

        if (l == null || r == null) {
            return false;
        }

        if (l.val == r.val) {
            return dfs(l.left, r.right) && dfs(l.right, r.left);
        }
        return false;
    }

    /**
     *  Definition for a binary tree node.
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

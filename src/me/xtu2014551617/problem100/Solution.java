package me.xtu2014551617.problem100;

/**
 * Created by xtu2014551617 on 17/8/21.
 * @see <a href="https://leetcode.com/problems/same-tree/description/">
 *  100. Same Tree</a>
 * 判断两棵二叉树是否是一样的
 */

public class Solution {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
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

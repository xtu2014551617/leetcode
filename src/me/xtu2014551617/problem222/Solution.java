package me.xtu2014551617.problem222;

public class Solution {
    public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return countNodes(root.right) + countNodes(root.left) + 1;
        }
    }
}

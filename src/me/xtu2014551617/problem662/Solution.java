
package me.xtu2014551617.problem662;

import javax.swing.text.Style;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static class MyTreeNode {
        TreeNode treeNode;
        int pos;
        MyTreeNode(TreeNode treeNode, int pos) {
            this.treeNode = treeNode;
            this.pos = pos;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root != null) {
            root.val = 1;
        }
        LinkedList<MyTreeNode> linkedList = new LinkedList<>();
        linkedList.add(new MyTreeNode(root, 1));
        int ans = 0;
        while (!linkedList.isEmpty()) {
            MyTreeNode head = linkedList.pop();
            if (head != null) {
                int height = head.treeNode.val + 1;
                if (head.treeNode.left != null) head.treeNode.left.val = height;
                if (head.treeNode.right != null) head.treeNode.right.val = height;
                linkedList.add(new MyTreeNode(head.treeNode.left, 2 * head.pos));
                linkedList.add(new MyTreeNode(head.treeNode.left, 2 * head.pos + 1));
                if ()
                ans = Math.max(ans, head.pos - left + 1);
            }
        }
        return ans;
    }
}

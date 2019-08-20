
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
        int pos, depth;
        MyTreeNode(TreeNode treeNode, int pos, int depth) {
            this.treeNode = treeNode;
            this.pos = pos;
            this.depth = depth;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<MyTreeNode> linkedList = new LinkedList<>();
        linkedList.add(new MyTreeNode(root, 0, 0));
        int ans = 0;
        int lastWeight = 0;
        int lastPos = 0;
        while (!linkedList.isEmpty()) {
            MyTreeNode head = linkedList.pop();
            if (head.treeNode == null)
                continue;
            linkedList.add(new MyTreeNode(head.treeNode.left, 2 * head.pos, head.depth + 1));
            linkedList.add(new MyTreeNode(head.treeNode.right, 2 * head.pos + 1, head.depth + 1));
            if (lastWeight != head.depth) {
                lastWeight = head.depth;
                lastPos = head.pos;
            }
            ans = Math.max(ans, head.pos - lastPos + 1);
        }
        return ans;
    }
}

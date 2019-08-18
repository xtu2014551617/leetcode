package me.xtu2014551617.problem662;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        Solution.TreeNode root = new Solution.TreeNode(5);
        Solution.TreeNode left = new Solution.TreeNode(4);
        Solution.TreeNode right = new Solution.TreeNode(2);
        Solution.TreeNode leftleft = new Solution.TreeNode(1);
        Solution.TreeNode leftright = new Solution.TreeNode(3);
        root.left = left;
        root.right = null;
        root.left.left = null;
        root.left.right = right;
        root.left.right.right = leftleft;
        root.left.right.right.right = leftright;
//        root.right.right = new Solution.TreeNode(7);
        assertEquals(solution.widthOfBinaryTree(root) , 4);
    }
}

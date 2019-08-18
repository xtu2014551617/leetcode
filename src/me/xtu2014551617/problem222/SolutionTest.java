package me.xtu2014551617.problem222;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        Solution.TreeNode root = new Solution.TreeNode(1);
        Solution.TreeNode left = new Solution.TreeNode(2);
        Solution.TreeNode right = new Solution.TreeNode(3);
        Solution.TreeNode leftleft = new Solution.TreeNode(4);
        Solution.TreeNode leftright = new Solution.TreeNode(5);
        Solution.TreeNode rightLeft = new Solution.TreeNode(6);
        root.left = left;
        root.right = right;
        root.left.left = leftleft;
        root.left.right = leftright;
        root.right.left = rightLeft;
//        root.right.right = new Solution.TreeNode(7);
        assertEquals(solution.countNodes(root) , 6);
    }
}

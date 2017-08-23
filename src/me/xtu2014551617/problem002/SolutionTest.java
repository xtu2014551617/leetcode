package me.xtu2014551617.problem002;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sherlockmoon on 17/8/21.
 */
public class SolutionTest {

    private Solution solution = new Solution();
    Solution.ListNode listNode1;
    Solution.ListNode listNode2;

    @Before
    public void setSolution() {
        listNode1 = new Solution.ListNode(1);
        listNode1.next = new Solution.ListNode(4);
//        listNode1.next.next = new Solution.ListNode(3);
        listNode2 = new Solution.ListNode(0);
//        listNode2.next = new Solution.ListNode(9);
//        listNode2.next.next = new Solution.ListNode(4);
    }

    @org.junit.Test
    public void addTwoNumbers() throws Exception {
        printListNode(solution.addTwoNumbers(listNode1, listNode2));
    }

    private void printListNode(Solution.ListNode listNode) {
        Solution.ListNode head = listNode;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
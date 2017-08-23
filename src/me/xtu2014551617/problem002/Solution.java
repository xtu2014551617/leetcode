package me.xtu2014551617.problem002;

/**
 * leetcode 002  大数相加
 * 输入两个链表，返回相加的和
 */

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = l1;
        int sum = l1.val + l2.val;
        l1.val = sum % 10;
        int ten = sum >= 10 ? 1 : 0;
        while (l1.next != null || l2.next != null) {
            sum = getValue(l1.next) + getValue(l2.next) + ten;
            if (l1.next == null) {
                l1.next = new ListNode(sum % 10);
            } else {
                l1.next.val = sum % 10;
            }
            ten = sum >= 10 ? 1 : 0;
            l1 = getNext(l1);
            l2 = getNext(l2);
        }
        if (ten != 0) {
            l1.next = new ListNode(ten);
        }
        return head;
    }

    private static int getValue(ListNode l) {
       return l == null ? 0 : l.val;
    }

    private static ListNode getNext(ListNode l) {
        return l.next == null ? l : l.next;
    }

    /**
     * Definition for singly-linked list.
     */
     static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
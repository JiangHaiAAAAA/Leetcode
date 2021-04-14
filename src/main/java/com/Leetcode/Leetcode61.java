package com.Leetcode;

import com.common.ListNode;

public class Leetcode61 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        rotateRight(node1, 4);

    }

    /**
     * 旋转链表
     * 给你一个链表的头节点 head，旋转链表，将链表每个节点向右移动k个位置
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int len = 0;
        ListNode pre = head;
        while (pre != null) {
            len++;
            pre = pre.next;
        }

        int n = len - k % len;
        ListNode first = head;
        while (first.next != null) {
            first = first.next;
        }
        first.next = head;
        while (--n > 0) {
            head = head.next;
        }
        ListNode res = head.next;
        head.next = null;
        return res;
    }

}

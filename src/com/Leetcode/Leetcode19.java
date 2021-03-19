package com.Leetcode;

import com.common.ListNode;

public class Leetcode19 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        removeNthFromEnd(node1,2);
        System.out.println(node1.toString());
    }

    /**
     * 删除链表的倒数第K 个节点
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode first = pre;
        ListNode sencond = pre;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            sencond = sencond.next;
        }
        sencond.next = sencond.next.next;
        return pre.next;

    }

}

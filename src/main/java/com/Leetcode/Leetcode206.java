package com.Leetcode;

import com.common.ListNode;

import javax.xml.soap.Node;

public class Leetcode206 {
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

        reverseList1(node1);
    }

    /**
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode first = new ListNode(0);
        ListNode sencond = head;

        return first.next;
    }

    /**
     * 翻转链表
     *
     * @param head
     * @return
     */
    public static ListNode reverseList1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode first = pre;
        ListNode sencond = pre.next;
        while (sencond.next != null) {
            ListNode temp = sencond.next;
            ListNode temp1 = first.next;
            sencond.next = temp.next;
            first.next = temp;
            temp.next = temp1;
        }
        return first.next;
    }
}

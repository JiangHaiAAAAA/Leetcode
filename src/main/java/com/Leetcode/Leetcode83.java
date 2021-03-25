package com.Leetcode;

import com.common.ListNode;

public class Leetcode83 {
    public static void main(String[] args) {

    }

    /**
     * 删除重复的升序链表，重复的只保留一个
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.var == cur.next.next.var) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return pre.next;
    }
}

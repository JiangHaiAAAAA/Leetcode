package com.Leetcode;

import com.common.ListNode;

public class Leetcode82 {
    public static void main(String[] args) {

    }

    /**
     * 删除重复的升序链表 例如head= {1，2，2，4，4,5}  输出{1,5}
     *
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.var == cur.next.next.var) {
                int x = cur.next.var;
                while (cur.next != null && cur.next.var == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return pre.next;
    }
}

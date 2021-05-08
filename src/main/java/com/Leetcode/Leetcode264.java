package com.Leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Leetcode264 {

    public static void main(String[] args) {

    }


    /**
     * 丑数
     * <p>
     * 丑数 就是只包含质因数 2、3 和/或 5 的正整数. 给你一个整数n，请你找出并返回第n个丑数。
     *
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int nums[] = {2, 3, 5};
        Set<Long> set = new HashSet<Long>();
        PriorityQueue<Long> queue = new PriorityQueue();
        set.add(1L);
        queue.offer(1L);
        for (int i = 1; i <= n; i++) {
            long x = queue.poll();
            if (i == n) {
                return (int) x;
            }
            for (int num : nums) {
                if (!set.contains(num * x)) {
                    set.add(num * x);
                    queue.offer(num * x);
                }
            }
        }
        return -1;
    }
}

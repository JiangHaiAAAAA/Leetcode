package com.Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leetcode1006 {
    public static void main(String[] args) {
        System.out.println(clumsy(4));
    }

    /**
     * 笨阶乘
     *
     * @param N
     * @return
     */
    public static int clumsy(int N) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(N);
        N--;
        int index = 0;
        while (N > 0) {
            if (index % 4 == 0) {
                stack.push(stack.pop() * (N));
            }
            if (index % 4 == 1) {
                stack.push(stack.pop() / (N));
            }
            if (index % 4 == 2) {
                stack.push(N);
            }
            if (index % 4 == 3) {
                stack.push(-N);
            }
            index++;
            N--;
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}

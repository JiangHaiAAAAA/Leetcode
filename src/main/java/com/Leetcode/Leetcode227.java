package com.Leetcode;

import java.util.Stack;

public class Leetcode227 {
    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s));
    }

    /**
     * 基本计算器2
     * 给你一个字符串表达式s，请你实现一个基本计算器来计算并返回它的值
     * <p>
     * 思路：先计算乘除运算，将结果存入栈中，最后对栈求和。
     *
     * @param s
     * @return
     */
    public static int calculate(String s) {
        int res = 0, num = 0;
        Stack<Integer> stack = new Stack<>();
        char op = '+';
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            //
            if (Character.isDigit(ch)) {
                num = num * 10 + ch - '0';
            }
            if ("*+-/".contains(ch + "") || i == chars.length - 1) {
                switch (op) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                }
                op = ch;
                num = 0;
            }
        }

        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

}

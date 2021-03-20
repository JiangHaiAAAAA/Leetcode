package com.Leetcode;

import java.util.Stack;

public class Leercode150 {
    public static void main(String[] args) {

        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
    }

    /**
     *  逆波兰表达式  有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
     *
     * @param tokens
     * @return
     */
    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if ("+-*/".contains(tokens[i])) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(cala(a, b, tokens[i]));
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }


    public static int cala(int a, int b, String op) {
        int res = 0;
        switch (op) {
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
        }
        return res;
    }

}

package com.Leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Leetcode20 {
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid1(s));
    }

    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }


    public static boolean isValid1(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        return "".equals(s);
    }

}

package com.Leetcode;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class Leetcode3 {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(lengthOfLongestSubstring1(s));
    }

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
     * <p>
     * 滑动窗口
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        int start = 0, end = 0;
        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
            }
            res = Math.max(res, set.size());
        }
        return res;
    }


    public static int lengthOfLongestSubstring1(String s) {
        Queue<Character> queue = new LinkedBlockingDeque<>();
        int res = 0;
        int right = 0;
        while (right < s.length()) {
            if (queue.contains(s.charAt(right))) {
                queue.poll();

            } else {
                queue.add(s.charAt(right));
                right++;
                ;
            }
            res = Math.max(res, queue.size());
        }
        return res;
    }
}

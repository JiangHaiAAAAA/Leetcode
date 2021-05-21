package com.Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
    public static void main(String[] args) {
        String s = "abcdaefc";
        System.out.println(lengthOfLongestSubstring(s));
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

}

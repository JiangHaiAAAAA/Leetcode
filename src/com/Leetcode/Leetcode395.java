package com.Leetcode;

import java.util.HashMap;

public class Leetcode395 {
    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(s.split("b").toString());
        System.out.println("111");
    }

    /**
     * 给你一个字符串s和一个整数k，请你找出s中的最长子串，要求该子串中的每一字符出现次数都不少于k。返回这一子串的长度。
     *
     * @param s
     * @param k
     * @return
     */
    private static int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;
        HashMap<Character, Integer> counter = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c : counter.keySet()) {
            if (counter.get(c) < k) {
                int res = 0;
                for (String t : s.split(String.valueOf(c))) {
                    res = Math.max(res, longestSubstring(t, k));
                }
                return res;
            }
        }
        return s.length();
    }
}

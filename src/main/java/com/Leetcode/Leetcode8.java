package com.Leetcode;

public class Leetcode8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483649"));
    }

    /**
     * 字符串转换成整数
     *
     * @param s
     * @return
     */
    public static int myAtoi(String s) {
        int res = 0;
        s = s.trim();
        int flag = 1;
        char[] chars = s.toCharArray();
        if (chars== null || chars.length == 0){
            return 0;
        }
        int a = 0;
        if (chars[0] == '+') {
            flag = 1;
            a++;
        }
        if (chars[0] == '-') {
            flag = -1;
            a++;
        }
        for (int i = a; i < chars.length; i++) {
            int n = chars[i] -'0';
            if (n > 9 || n < 0) {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && n > 7)) {
                return Integer.MAX_VALUE;
            }

            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && n < 8)) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + n * flag;
        }
        return res;
    }
}

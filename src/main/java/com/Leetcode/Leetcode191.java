package com.Leetcode;

public class Leetcode191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(3));
        // jdk 自带的求二进制中1个数的函数
        System.out.println(Integer.bitCount(3));
    }

    /**
     * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）
     *
     * @param n
     * @return
     */
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static int hammingWeight1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}

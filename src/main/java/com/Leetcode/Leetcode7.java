package com.Leetcode;

public class Leetcode7 {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    /**
     * 反转整数
     * <p>
     * 对于这一道题其实不用考虑反转后是否大于7，如果要考虑是否大于7，那么前提是要得到反转结果为
     * 214748364 这样的数，所以也就是给的数为 *463847412（*表示大于 0 的任意数），即当 * 为 7、8、9 的时候才会成立，
     * 但是按照题目要求，给定的数为 32为数，也就是说 * 最多取到 1 ，大于 1 的时候，会报错，
     * 这也是官方并没有考虑这个问题的原因，因为根本不存在那样的数。
     * （当然啦，考虑大于7的情况，对于给定的数大于 32 位，这个程序仍然不会报错的）
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int n = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && n > 7)) {
                return 0;
            }

            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && n < -8)) {
                return 0;
            }
            x = x / 10;
            res = res * 10 + n;
        }
        return res;
    }
}

package me.xtu2014551617.problem029;

/**
 * 不用乘法，除法，模运算的情况下实现 快速的除法运算
 */
class Solution {
    public int divide(int dividend, int divisor) {
        long ans = add(dividend, 0, divisor, 0);
        if (dividend > 0 && divisor < 0) {
            ans = -ans;
        }
        if (dividend < 0 && divisor > 0) {
            ans = -ans;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            ans = Integer.MAX_VALUE;
        }
        return (int) ans;
    }

    private long add(long dividend, long y, int divisor, long ans) {
        if (Math.abs(dividend) == Math.abs(y + divisor)) {
            return ans + 1;
        }

        if (Math.abs(dividend) < Math.abs(y + divisor)) {
            return ans;
        }

        long tmp = divisor;
        long tmpAns = 1;
        while (Math.abs(y + tmp) <= Math.abs(dividend)) {
            y += tmp;
            tmp += tmp;
            ans += tmpAns;
            tmpAns += tmpAns;
        }
        return add(dividend, y, divisor, ans);
    }
}

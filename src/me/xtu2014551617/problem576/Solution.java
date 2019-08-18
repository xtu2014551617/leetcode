package me.xtu2014551617.problem576;

public class Solution {
    private static final int MOD = (int) Math.pow(10, 9) + 7;
    public int findPaths(int m, int n, int N, int i, int j) {
        if (m - N >= 0 && n - N >= 0) {
            return 0;
        } else {
            return 1;
        }
    }

}

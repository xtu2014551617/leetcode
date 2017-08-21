package me.xtu2014551617.problem121;

/**
 * Created by xtu2014551617 on 17/8/21.
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">121. Best Time to Buy and Sell Stock</a>
 * 给一个数组(代表每天的单股值)，找出最大利润
 *
 */
class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                // 17, 18, 19 优化，不然会超时。
                // 如果第(j)天－第(i)天为负值，那么第(m)天-第(j)天一定大于第(m)天减第(i)天
                if (prices[j] - prices[i] <= 0) {
                    break;
                }
                if (prices[j] - prices[i] > ans) {
                    ans = prices[j] - prices[i];
                }
            }
        }
        return ans;
    }
}
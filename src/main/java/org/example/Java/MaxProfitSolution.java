package org.example.Java;

/**
 * LeetCode 第121题
 *
 * 买卖股票的最佳时机
 * 给定一个数组prices，它的第i个元素prices［i］表示一支给定股票第i天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回0。
 *
 */
public class MaxProfitSolution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    /**
     * 数据量大时，超时
     *
     * @param prices 价格变动数组
     * @return 最大利润
     */
    private static int solutionOne(int[] prices) {
        if (prices == null || prices.length == 1) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }
}

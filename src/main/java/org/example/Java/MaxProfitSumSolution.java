package org.example.Java;

/**
 * LeetCode 第122题
 *
 * 买卖股票的最佳时机
 * 给定一个数组prices，它的第i个元素prices［i］表示一支给定股票第i天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有一股股票。你也可以先购买，然后在 同一天 出售。
 * 返回 你能获得的 最大利润。
 *
 */
public class MaxProfitSumSolution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}



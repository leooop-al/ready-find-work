package work.ziyou.s202402.d26;

/**
 * 最佳买卖股票时机含冷冻期
 * <p>
 * 一种常用的方法是将「买入」和「卖出」分开进行考虑：「买入」为负收益，而「卖出」为正收益。在初入股市时，你只有「买入」的权利
 * 只能获得负收益。而当你「买入」之后，你就有了「卖出」的权利，可以获得正收益。显然，我们需要尽可能地降低负收益而提高正收益，
 * 因此我们的目标总是将收益值最大化。因此，我们可以使用动态规划的方法，维护在股市中每一天结束后可以获得的「累计最大收益」，
 * 并以此进行状态转移，得到最终的答案。
 */
public class Leetcode309 {

    public static void main(String[] args) {
        Leetcode309 leetcode309 = new Leetcode309();
    }

    /**
     * 第二种情况 dp[i][0] 我们目前持有一支股要， 对应对累计最大收益为dp[i][0]
     * 第三种情况 dp[i][1] 我们不持有任何股票，并且在冷冻期， 对应对累计最大收益为dp[i][1]
     * 第一种情况 dp[i][2] 我们不持有任何股票，并且不在冷冻期，对应对累计最大收益为dp[i][2]
     * <p>
     * dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2] -prices[i])
     * dp[i][1] = dp[i-1][0] + prices[i]
     * dp[i][2] = Math.max(dp[i-1][2], f[i-1][1])
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;

        int[][] dp = new int[n][3];
        dp[0][0] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
            dp[i][1] = dp[i - 1][0] + prices[1];
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1]);
        }

        return Math.max(dp[n - 1][2], dp[n - 1][1]);
    }

}

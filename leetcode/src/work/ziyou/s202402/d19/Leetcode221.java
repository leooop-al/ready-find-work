package work.ziyou.s202402.d19;

public class Leetcode221 {

    public static void main(String[] args) {

    }

    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            dp[i][0] = matrix[i][0] - '0';
            ans = Math.max(ans, dp[i][0]);
        }


        for (int i = 0; i < m; i++) {
            dp[0][i] = matrix[0][i] - '0';
            ans = Math.max(ans, dp[0][i]);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == '0') {
                    continue;
                }
                dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]) + 1;
                ans = Math.max(ans, dp[i][j]);
            }
        }

        return ans * ans;
    }
}

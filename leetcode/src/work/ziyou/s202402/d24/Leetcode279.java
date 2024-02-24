package work.ziyou.s202402.d24;

public class Leetcode279 {

    public static void main(String[] args) {
        Leetcode279 leetcode279 = new Leetcode279();
        System.out.println(leetcode279.numSquares(12));
    }


    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = n;

        for (int i = 1; i <= n; i++) {

            int min = n;
            for (int j = 1; j *j <=i; j++) {
                min = Math.min(dp[i - j * j] + 1, min);
            }
            dp[i] = min;
        }
        return dp[n];
    }
}

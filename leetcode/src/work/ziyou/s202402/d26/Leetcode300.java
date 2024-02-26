package work.ziyou.s202402.d26;

/**
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 */
public class Leetcode300 {

    public static void main(String[] args) {
        Leetcode300 leetcode300 = new Leetcode300();
        int i = leetcode300.lengthOfLIS(new int[]{4,10,4,3,8,9});
        System.out.println(i);
    }


    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }

        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] <= nums[i]) {
                    continue;
                }
                dp[j] = Math.max(dp[i] + 1, dp[j]);
                max = Math.max(dp[j], max);
            }
        }

        return max;
    }

}

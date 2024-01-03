package work.ziyou.s202401.d03;

/**
 * 有更好的解法
 */
public class Leetcode152 {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            max = Math.max(nums[i], max);
            for (int j= i+1; j < nums.length; j++) {
                temp *= nums[j];
                max = Math.max(max, temp);
            }
        }
        return max;
    }

}

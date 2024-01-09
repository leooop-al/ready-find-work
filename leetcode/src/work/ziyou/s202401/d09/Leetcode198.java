package work.ziyou.s202401.d09;

public class Leetcode198 {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        for (int i = 2; i < nums.length; i++) {
            int max = nums[i];
            for (int j = i; j > 1; j--) {
                int temp = Math.max(nums[i - 1], nums[i - j] + nums[i]);
                max = Math.max(max, temp);
            }
            nums[i] = max;
        }

        return nums[nums.length - 1];
    }
}

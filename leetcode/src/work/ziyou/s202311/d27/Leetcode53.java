package work.ziyou.s202311.d27;

public class Leetcode53 {

    public int maxSubArray(int[] nums) {
        int data = 0;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            data += nums[i];
            result = Math.max(data, result);
            data = Math.max(data, 0);
        }

        return result;
    }

}

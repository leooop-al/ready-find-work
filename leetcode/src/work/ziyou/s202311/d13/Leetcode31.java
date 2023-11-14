package work.ziyou.s202311.d13;

import java.util.Arrays;

/**
 * 题解不错！
 *
 */
public class Leetcode31 {

    public static void main(String[] args) {
        Leetcode31 leetcode31 = new Leetcode31();

        int[] nums = new int[]{1,2,3,8,5,7,6,4};
        leetcode31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void nextPermutation(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        // 确定锚点
        int k = nums.length - 1;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i-1] < nums[i]) {
                k = i-1;
                break;
            }
        }

        // 说明是倒排点
        if (k == nums.length - 1) {
            Arrays.sort(nums);
            return;
        }

        // 交换
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[k]) {
                //
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                break;
            }
        }

        if (nums.length - 1 - k <= 1) {
            return;
        }

        int[] temp = new int[nums.length - 1 - k];
        for (int i = 0; i < nums.length - k - 1; i++) {
            temp[nums.length - k - 2 - i] = nums[nums.length - 1 - i];
        }
        // 剩下的进行排序
        Arrays.sort(temp);

        for (int i = 0; i < nums.length - k -1; i++) {
            nums[nums.length - 1 - i] = temp[nums.length - k - 2 - i];
        }
    }

}

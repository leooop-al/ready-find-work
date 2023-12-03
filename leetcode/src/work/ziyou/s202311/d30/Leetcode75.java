package work.ziyou.s202311.d30;

import java.util.Arrays;

/**
 * 颜色排序，双指针
 */
public class Leetcode75 {

    public static void main(String[] args) {
        Leetcode75 leetcode75 = new Leetcode75();

        int[] nums = {1, 0, 2, 1, 1, 2};
        leetcode75.sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }

    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
    }

    private void swap(int[] nums, int a, int b) {
        int v = nums[a];
        nums[a] = nums[b];
        nums[b] = v;
    }
}

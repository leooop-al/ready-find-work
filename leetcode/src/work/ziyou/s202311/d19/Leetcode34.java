package work.ziyou.s202311.d19;

import java.util.Arrays;

public class Leetcode34 {

    public static void main(String[] args) {
        Leetcode34 leetcode34 = new Leetcode34();
        System.out.println(Arrays.toString(leetcode34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                index = mid;
                break;
            }
        }

        if (index == -1) {
            return new int[]{-1, -1};
        }

        int k1 = index;
        while (k1 >= 0) {
            if (nums[k1] != target) {
               break;
            }
            k1--;
        }

        int k2 = index;
        while (k2 <= nums.length-1) {
            if (nums[k2] != target) {
                break;
            }
            k2++;
        }
        return new int[]{k1 + 1, k2 -1};
    }
}

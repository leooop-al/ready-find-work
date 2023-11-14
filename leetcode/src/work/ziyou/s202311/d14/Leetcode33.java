package work.ziyou.s202311.d14;

public class Leetcode33 {

    public static void main(String[] args) {
        Leetcode33 leetcode33 = new Leetcode33();
        int search = leetcode33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        System.out.println(search);
    }

    public int search(int[] nums, int target) {

        int left  = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;

            // 当nums[0] < nums[mid] && target 在他们中间时， 这个时候已经是正序了
            // 当nums[0] < nums[mid] && target 不在他们中间时， 在右半部分

            // 否则，nums[mid] < nums[n-1] && target 在他们中间时， 这个时候已经是正序了
            // 否则，nums[mid] < nums[n-1] && target 不在他们中间时，在左边了

        }

        return 0;
    }

}

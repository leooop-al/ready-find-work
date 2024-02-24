package work.ziyou.s202402.d24;

public class Leetcode283 {

    public static void main(String[] args) {
        Leetcode283 leetcode283 = new Leetcode283();
        leetcode283.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[prev] = nums[i];
                prev++;
            }
        }
        for (int i = prev; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

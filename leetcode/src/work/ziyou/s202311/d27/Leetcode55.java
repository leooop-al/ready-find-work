package work.ziyou.s202311.d27;

/**
 * 还有更好的算法方案
 */
public class Leetcode55 {

    public static void main(String[] args) {
        Leetcode55 leetcode55 = new Leetcode55();
        System.out.println(leetcode55.canJump(new int[]{3,2,1,0,4}));
    }

    public boolean canJump(int[] nums) {
        boolean[] jump = new boolean[nums.length];
        jump[0] = true;
        for (int i = 0; i < nums.length && jump[i]; i++) {
            for (int j = 1; j <= nums[i] && i+j < nums.length; j++) {
                jump[i+j] = jump[i];
            }
        }
        return jump[nums.length - 1];
    }

}

package work.ziyou.s202308.d01;


/**
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 */
public class Leetcode11 {

    public static void main(String[] args) {
        Leetcode11 leetcode11 = new Leetcode11();
        System.out.println(leetcode11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 8, 1}));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = 0;
        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}

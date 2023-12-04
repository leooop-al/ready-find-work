package work.ziyou.s202312.d04;

import java.util.Stack;

public class Leetcode84 {

    public static void main(String[] args) {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};

        Leetcode84 leetcode84 = new Leetcode84();
        System.out.println(leetcode84.largestRectangleArea(heights));
    }

    public int largestRectangleArea(int[] heights) {
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.empty() && heights[stack.peek()] >= heights[i]) {
                right[stack.pop()] = i;
            }
            left[i] = stack.empty() ? -1 : stack.peek();
            stack.push(i);
        }

        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            res = Math.max(res, (right[i] - left[i] - 1) * heights[i]);
        }
        return res;
    }

    // 时间不允许
    public int largestRectangleAreaN2(int[] heights) {

        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            int length = Integer.MAX_VALUE;
            for (int j = i; j < heights.length; j++) {
                length = Math.min(length, heights[j]);
                result = Math.max(result, length * (j - i + 1));
            }
        }
        return result;
    }
}

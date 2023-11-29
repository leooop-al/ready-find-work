package work.ziyou.s202311.d29;

public class Leetcode70 {

    public static void main(String[] args) {
        Leetcode70 leetcode70 = new Leetcode70();
        System.out.println(leetcode70.climbStairs(5));
    }

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] temp = new int[n+1];
        temp[1] = 1;
        temp[2] = 2;
        for (int i = 3; i <= n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp[n];
    }

}

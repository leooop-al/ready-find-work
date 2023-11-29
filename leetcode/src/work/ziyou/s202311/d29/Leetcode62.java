package work.ziyou.s202311.d29;

public class Leetcode62 {

    public static void main(String[] args) {
        Leetcode62 leetcode62 = new Leetcode62();
        System.out.println(leetcode62.uniquePaths(3, 3));
    }

    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; ++x, ++y) {
            ans = ans * x / y;
        }
        return (int) ans;
    }
}

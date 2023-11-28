package work.ziyou.s202311.d26;

public class Leetcode50 {

    public static void main(String[] args) {
        Leetcode50 leetcode50 = new Leetcode50();
        System.out.println(leetcode50.myPow(2, -2147483648));
    }

    public double myPow(double x, int n) {
        long N = n;
        return N>=0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N/2);
        return N % 2 == 0 ? y *y : y * y *x;
    }
}

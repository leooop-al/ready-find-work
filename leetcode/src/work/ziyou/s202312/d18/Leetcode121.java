package work.ziyou.s202312.d18;

public class Leetcode121 {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int min = 10001;
        int result = 0;
        for (int price : prices) {
            result = Math.max(result, price - min);
            min = Math.min(min, price);
        }
        return result;
    }
}

package work.ziyou.s202312.d05;

/**
 * 动态规划 or 数学算法
 **/
public class Leetcode96 {

    public static void main(String[] args) {
        Leetcode96 leetcode96 = new Leetcode96();
        System.out.println(leetcode96.numTrees(3));
    }

    public int numTrees(int n) {
        return numTrees(n, 0, new boolean[n]);
    }

    private int numTrees(int n, int cur, boolean[] mark) {
        return 0;
    }
}

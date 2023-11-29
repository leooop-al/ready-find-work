package work.ziyou.s202311.d29;

public class Leetcode64 {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Leetcode64 leetcode64 = new Leetcode64();
        System.out.println(leetcode64.minPathSum(grid));
    }

    public int minPathSum(int[][] grid) {
        if (null == grid) {
            return 0;
        }
        int[][] pathValues = new int[grid.length][grid[0].length];
        pathValues[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            pathValues[0][i] = pathValues[0][i-1]+ grid[0][i];
        }

        for (int j = 1; j < grid.length; j++) {
            pathValues[j][0] =  pathValues[j-1][0] + grid[j][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                pathValues[i][j] = Math.min(pathValues[i - 1][j], pathValues[i][j - 1]) + grid[i][j];
            }
        }
        return pathValues[grid.length - 1][grid[0].length - 1];
    }

}

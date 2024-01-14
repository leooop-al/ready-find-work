package work.ziyou.s202401.d10;

public class Leetcode200 {

    public int numIslands(char[][] grid) {

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    findLands(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    private void findLands(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length) {
            return;
        }
        if (j < 0 || j >= grid[i].length) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        findLands(grid, i - 1, j);
        findLands(grid, i + 1, j);
        findLands(grid, i, j - 1);
        findLands(grid, i, j + 1);
    }

}

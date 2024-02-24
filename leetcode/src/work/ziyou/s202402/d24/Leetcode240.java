package work.ziyou.s202402.d24;

public class Leetcode240 {

    public static void main(String[] args) {
        Leetcode240 leetcode240 = new Leetcode240();

        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        boolean b = leetcode240.searchMatrix(matrix, 6);
        System.out.println(b);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int left = matrix[0].length-1;
        int down = 0;
        while (down < matrix.length && left >= 0) {
            if (matrix[down][left] == target) {
                return true;
            } else if (matrix[down][left] < target) {
                down++;
            } else {
                left--;
            }
        }
        return false;
    }

}

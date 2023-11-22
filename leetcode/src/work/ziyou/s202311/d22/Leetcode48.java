package work.ziyou.s202311.d22;

import java.util.Arrays;

public class Leetcode48 {

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
//        int[][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};

//        int[][] matrix = new int[][]{{2,29,20,26,16,28}, {12,27,9,25,13,21}, {32,33,32,2,28,14},
//                {13,14,32,27,22,26},{33,1,20,7,21,7},{4,24,1,6,32,34}};

        int[][] matrix = new int[][]{{13, 15, 42, 10, 92, 42, 74, 2, 33, 11}, {86, 55, 13, 30, 42, 38, 93, 86, 6, 76}, {51, 58, 50, 32, 36, 93, 51, 15, 96, 11}, {46, 4, 37, 14, 9, 39, 86, 80, 29, 53}, {1, 17, 5, 17, 75, 20, 47, 18, 39, 87}, {21, 86, 71, 32, 7, 85, 39, 42, 67, 98}, {80, 12, 23, 54, 4, 7, 85, 59, 16, 35}, {8, 74, 66, 55, 35, 37, 36, 47, 52, 12}, {77, 23, 62, 69, 55, 39, 4, 81, 88, 48}, {2, 20, 15, 59, 86, 48, 34, 21, 54, 53}};

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        matrix = new int[][]{{11,76,11,53,87,98,35,12,48,53},{33,6,96,29,39,67,16,52,88,54},{2,86,15,80,18,42,59,47,81,21},{74,93,51,86,47,39,85,36,4,34},{42,38,93,39,20,85,7,37,39,48},{92,42,36,9,75,7,4,35,55,86},{10,30,32,14,17,32,54,55,69,59},{42,13,50,37,5,71,23,66,62,15},{15,55,58,4,17,86,12,74,23,20},{13,86,51,46,1,21,80,8,77,2}};


        System.out.println("===============");

        Leetcode48 leetcode48 = new Leetcode48();
        leetcode48.rotate(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public void rotate(int[][] matrix) {
        if (matrix.length == 1) {
            return;
        }

        int length = matrix.length;
        int count = 0;
        while (length >= 1) {
            rotate(matrix, count);
            length -= 2;
            count++;
        }
    }


    private void rotate(int[][] matrix, int offset) {
        int length = matrix.length;
        for (int i = 0; i < (length - 2 * offset - 1); i++) {
            int v1 = matrix[offset][i + offset];
            int v2 = matrix[i + offset][length - 1 - offset];
            int v3 = matrix[length - 1 - offset][length - 1 - offset - i];
            int v4 = matrix[length - 1 - offset - i][offset];


            matrix[offset][i + offset] = v4;
            matrix[i + offset][length - 1 - offset] = v1;
            matrix[length - 1 - offset][length - 1 - offset - i] = v2;
            matrix[length - 1 - offset - i][offset] = v3;
        }
    }
}

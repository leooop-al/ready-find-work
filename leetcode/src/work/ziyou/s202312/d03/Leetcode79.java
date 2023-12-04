package work.ziyou.s202312.d03;

/**
 * 单词搜索
 */
public class Leetcode79 {

    public static void main(String[] args) {
        Leetcode79 leetcode79 = new Leetcode79();

//        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        char[][] board = new char[][]{{'a','b'}, {'c','d'}};
        System.out.println(leetcode79.exist(board, "acdb"));

    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (exist(board, i, j, word, 0, new boolean[n][m])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int a, int b, String word, int index, boolean[][] mark) {
        if (index >= word.length()) {
            return true;
        }

        if (a < 0 || a > board.length - 1) {
            return false;
        }

        if (b < 0 || b > board[0].length - 1) {
            return false;
        }

        if (mark[a][b]) {
            return false;
        }

        mark[a][b] = true;
        if (board[a][b] != word.charAt(index)) {
            mark[a][b] = false;
            return false;
        }

        boolean b1 = exist(board, a, b + 1, word, index + 1, mark);

        boolean b2 = exist(board, a, b - 1, word, index + 1, mark);

        boolean b3 = exist(board, a + 1, b, word, index + 1, mark);

        boolean b4 = exist(board, a - 1, b, word, index + 1, mark);

        return b1 || b2 || b3 || b4;
    }
}

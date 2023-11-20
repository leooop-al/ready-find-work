package work.ziyou.s202311.d19;

public class Leetcode36 {

    public static void main(String[] args) {
        Leetcode36 leetcode36 = new Leetcode36();

        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '5', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(leetcode36.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        boolean[][] colMark = new boolean[board.length][board.length];
        boolean[][] rolMark = new boolean[board.length][board.length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (colMark[i][board[i][j] - '1']) {
                    return false;
                }
                colMark[i][board[i][j] - '1'] = true;
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (rolMark[i][board[j][i] - '1']) {
                    return false;
                }
                rolMark[i][board[j][i] - '1'] = true;
            }
        }

        boolean[][] splitMark = new boolean[9][9];
        for (int k = 0; k < 9; k++) {
            int r = k / 3;
            int c = k % 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[r * 3 + i][c * 3 + j] == '.') {
                        continue;
                    }
                    if (splitMark[k][board[r * 3 + i][c * 3 + j] - '1']) {
                        return false;
                    }
                    splitMark[k][board[r * 3 + i][c * 3 + j] - '1']=true;
                }
            }
        }

        return true;
    }

}

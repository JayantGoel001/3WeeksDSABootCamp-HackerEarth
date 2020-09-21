import java.util.Scanner;


public class NQueenProblem {
    static Integer count = 0;
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        solveNQueen(n);
    }

    private static void solveNQueen(int n){
        int[][] board = new int[n][n];
        solveNQueenUtil(board,n,0);
        System.out.println(count);
    }

    private static void solveNQueenUtil(int[][] board, Integer n, int y) {
        if (y==n){
            ++count;
        }
        for (int i = 0; i <n ; i++) {
            if (isSafe(board,n,i,y)){
                board[i][y] = 1;
                solveNQueenUtil(board, n, y+1);
                board[i][y]=0;
            }
        }
    }

    private static boolean isSafe(int[][] board, int n, int x, int y) {
        if (x>=n || y>=n){
            return false;
        }
        for (int i = 0; i < x; i++) {
            if (board[i][y]==1){
                return false;
            }
        }
        for (int j = 0; j < y; j++) {
            if (board[x][j]==1){
                return false;
            }
        }
        for (int i = x ,j=y ; i >=0 && j>=0 ; i-- ,j--) {
            if (board[i][j]==1){
                return false;
            }
        }
        for (int i = x ,j=y; j>=0 && i<n ; i++,j--) {
            if (board[i][j]==1){
                return false;
            }
        }

        return true;
    }
}

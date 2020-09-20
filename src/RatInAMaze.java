import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RatInAMaze {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st==null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        Integer nextInt(){
            return  Integer.parseInt(next());
        }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int m = fr.nextInt();

        Character[][] ar = new Character[n][m];
        for (int i = 0; i < n; i++) {
            String x = fr.next();
            for (int j = 0; j < m; j++) {
                ar[i][j] = x.charAt(j);
            }
        }
        int[][] solveMazeArray = new int[n][m];
        solvedMaze(ar,n,m,solveMazeArray);
    }

    private static void solvedMaze(Character[][] ar, int n, int m, int[][] solveMaze) {
        if (solvedMazeUtil(ar,n,m,solveMaze,0,0)){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(solveMaze[i][j]+" ");
                }
                System.out.println();
            }
        }else {
            System.out.println("-1");
        }
    }

    private static boolean solvedMazeUtil(Character[][] ar, int n, int m, int[][] solveMaze,int x,int y) {
        if (x==n-1 && y==m-1 && ar[x][y]=='O'){
            solveMaze[x][y] = 1;
            return true;
        }
        if (isSafe(ar,n,m,x,y)){
            solveMaze[x][y] =1;
            if (solvedMazeUtil(ar, n, m, solveMaze, x, y+1)){
                return true;
            }
            if (solvedMazeUtil(ar, n, m, solveMaze, x+1, y)){
                return true;
            }
            solveMaze[x][y]  = 0;
        }
        return false;
    }

    private static boolean isSafe(Character[][] ar, int n, int m, int i, int j) {
        return i<n && j<m && ar[i][j] == 'O';
    }
}

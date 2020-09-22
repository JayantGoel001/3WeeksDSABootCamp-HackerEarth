import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DiskTower {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] ar = new int[n+1];
        int min = n;
        int size = n;
        for (int i = 0; i < n; i++) {
            int x= fr.nextInt();
            ar[x] = x;
            if (x==min){
                while (ar[size]!=0){
                    System.out.print(size+" ");
                    size--;
                }
                min = size;
            }
            System.out.println();
        }
    }

}

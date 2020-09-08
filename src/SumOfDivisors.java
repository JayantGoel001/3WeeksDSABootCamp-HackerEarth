import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfDivisors {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            if(st==null || !st.hasMoreElements()){
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
        int t = fr.nextInt();
        for (int i = 0; i < t; i++) {
            int n = fr.nextInt();
            int k = fr.nextInt();
            System.out.println(sumOfDiv(n,k)-sumOfDiv(3,0)-sumOfDiv(6,0)-sumOfDiv(9,0));
        }

    }

    private static int sumOfDiv(int n, int k) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return n;
        }
        else {
            return sumOfDiv(n-1,k) + sumOfDiv(n-2,k);
        }
    }
}

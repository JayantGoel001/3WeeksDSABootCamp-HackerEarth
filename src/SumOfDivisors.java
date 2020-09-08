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
            long n = fr.nextInt();
            int k = fr.nextInt();

            long sum=n*(n+1)/2;

            long k_pow = k;
            while (k_pow<=n){
                long num = n/k_pow;
                sum = sum -  k * num*(num+1)/2 + num*(num+1)/2;
                k_pow*=k;
            }
            System.out.println(sum);
        }
    }
}

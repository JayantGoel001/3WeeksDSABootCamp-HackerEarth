import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SignalRange {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        Integer nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        for (int i = 0; i < t; i++) {
            int n = fr.nextInt();
            Long[] ar = new Long[n];
            for (int j = 0; j < n; j++) {
                ar[j] = fr.nextLong();
            }
            Long[] count = new Long[n];
            for (int j = 0; j < n; j++) {
                long ele= ar[j];
                count[j] = 1L;
                for (int k = j; k >=0 ; k--) {
                    if (ele>ar[k]){
                        count[j]++;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(count[j]+" ");
            }
            System.out.println();
        }
    }

}

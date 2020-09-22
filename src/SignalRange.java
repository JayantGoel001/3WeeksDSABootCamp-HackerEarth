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
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        for (int i = 0; i < t; i++) {
            int n = fr.nextInt();
            int[] ar = new int[n];
            int[] count = new int[n];
            for (int j = 0; j < n; j++) {
                ar[j] = fr.nextInt();
                count[j]=0;
            }
            Stack<Integer> stack = new Stack<>();
            for (int j = n-1; j >=0 ; j--) {
                while (!stack.empty() && ar[j]>ar[stack.peek()]){
                    count[stack.peek()]=j;
                    stack.pop();
                }
                stack.push(j);
            }
            while (!stack.empty()){
                count[stack.peek()]=-1;
                stack.pop();
            }
            for (int j = 0; j < n; j++) {
                System.out.print(j-count[j]+" ");
            }
            System.out.println();
        }
    }

}

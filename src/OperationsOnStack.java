import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class OperationsOnStack {
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
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int k = fr.nextInt();
        Stack<Long> stack = new Stack<>();
        long max = 0L;
        for (int i = 0; i < n; i++) {
            long x = fr.nextLong();
            stack.add(x);
            if (x>max){
                max = x;
            }
        }

        if (k<=n) {
            max = 0L;
            while (k != 0 && !stack.empty()) {
                max = stack.peek();
                stack.pop();
                k--;
            }

            if (!stack.isEmpty()) {
                max = Math.max(stack.peek(), max);
                System.out.println(max);
            } else {
                System.out.println("-1");
            }
        }else {
            System.out.println(max);
        }
    }
}

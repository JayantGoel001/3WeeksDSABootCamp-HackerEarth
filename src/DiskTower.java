import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

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
        Stack<Integer> stack = new Stack<>();
        int n = fr.nextInt();
        for (int i = 0; i < n; i++) {
            int x= fr.nextInt();
            if (!stack.isEmpty()) {
                if (x < stack.peek()) {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.peek()+" ");
                        stack.pop();
                    }
                }
                System.out.println();
            }
            stack.push(x);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }

    }
}

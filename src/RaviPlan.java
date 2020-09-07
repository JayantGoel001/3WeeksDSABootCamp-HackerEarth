import java.io.*;
import java.util.*;
class RaviPlan {
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
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();

        int j=0;
        int k=0;
        int max=0;
        for(int i=0;i<n;i++){
            int x = fr.nextInt();
            if(x==0){
                j++;
                max = Math.max(j,max);
                k=0;
            }else{
                k++;
                max = Math.max(k,max);
                j=0;
            }
        }
        System.out.println(max);
    }
}

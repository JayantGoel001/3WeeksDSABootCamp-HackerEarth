import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PratikAndDNA {
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
        int nextInt(){
            return Integer.parseInt(next());
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
        int t  = fr.nextInt();
        HashMap<Character,Character> map = new HashMap<>();

        map.put('A','T');
        map.put('T','A');
        map.put('G','C');
        map.put('C','G');

        for (int i = 0; i < t; i++) {
            int n = fr.nextInt();
            String str = fr.nextLine();
            StringBuilder st = new StringBuilder();
            boolean isRNA = false;
            for (int j = 0; j < n; j++) {
                char x = str.charAt(j);
                if(!map.containsKey(x)){
                    isRNA = true;
                    System.out.println("Error RNA nucleobases found!");
                    break;
                }else{
                    st.append(map.get(x));
                }
            }
            if (!isRNA){
                System.out.println(st.toString());
            }
        }
    }
}

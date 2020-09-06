import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RaviPlan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int j=0;
        int k=0;
        int max=0;
        String[] arr = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(arr[i]);
            if (x==0){
                j++;
                max = Math.max(j,max);
                k=0;
            }
            else{
                k++;
                max=Math.max(k,max);
                j=0;
            }
        }
        System.out.println(max);
    }
}

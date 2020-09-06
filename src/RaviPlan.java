import java.util.Arrays;
import java.util.Scanner;

public class RaviPlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar= new int[n];
        int[] x = new int[n];
        int k=0;
        for (int i = 0; i <n; i++) {
            ar[i] = scanner.nextInt();
            if(i!=0){
                if (ar[i] != ar[i - 1]) {
                    k++;
                }
                x[k]+=1;
            }else{
                x[k] = 1;
            }
        }

        int max=0;
        for (int i = 0; i < n; i++) {
            if(x[i]>max){
                max=x[i];
            }
        }
        System.out.println(max);
    }
}

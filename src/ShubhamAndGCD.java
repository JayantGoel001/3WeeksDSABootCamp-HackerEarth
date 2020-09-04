import java.util.Scanner;

public class ShubhamAndGCD {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a= new int[n];
            int[] b= new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum+= GCD(a[j],b[n-j-1]);
            }
            System.out.println(sum);
        }
    }

    public static int GCD(int a,int b){
        if(a==1 || b==1){
            return 1;
        }
        else if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else{
            if(a>b){
                return GCD(a-b,b);
            }
            else{
                return GCD(a,b-a);
            }
        }
    }
}

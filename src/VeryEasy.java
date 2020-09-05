import java.util.Arrays;
import java.util.Scanner;

public class VeryEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] ar =new int[n];
            for (int j = 0; j < n; j++) {
                ar[j] = scanner.nextInt();
            }
            Arrays.sort(ar);
            int minSum = 0;
            int maxSum =0;
            for (int j = 0; j < m; j++) {
                minSum+= ar[j];
                maxSum+=ar[n-j-1];
            }
            System.out.println(maxSum-minSum);
        }
    }
}

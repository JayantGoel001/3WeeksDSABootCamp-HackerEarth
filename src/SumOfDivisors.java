import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tot = 1000000000+1;
//        int[] ar =new int[tot];
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(0);
        ar.add( 1);
        ar.add(2);
        for (int i = 3; i <tot; i++) {
            ar.add(ar.get(i-1)+ar.get(i-2));
        }
        int t =sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(ar.get(n));
        }
    }
}

import java.io.*;
//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class SecondLargest {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar =new int[3];
        for(int i=0;i<n;i++)
        {
            ar[0] = scanner.nextInt();
            ar[1] = scanner.nextInt();
            ar[2] = scanner.nextInt();
            Arrays.sort(ar);
            System.out.println(ar[1]);
        }
    }
}

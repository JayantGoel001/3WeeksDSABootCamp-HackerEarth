import java.util.Scanner;

public class RohanTheMagician {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cumSum = new int[n];
        for (int i = 0; i < n; i++) {
            int x= scanner.nextInt();
            if (i!=0){
                cumSum[i] = cumSum[i-1] + x;
            }else {
                cumSum[i] = x;
            }
        }
        int t =scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            x = cumSum[n-1] - x;
            int index = binarySearch(cumSum,x);
            System.out.println(index);
        }
    }

    private static int binarySearch(int[] cumSum, int x) {
        int start = 0;
        int last = cumSum.length-1;
        if (x<=cumSum[0]){
            return 0;
        }
        while (start<=last){
            int mid = (start+last)/2;
            if(mid-1>= 0 && mid+1<= cumSum.length-1 && x>=cumSum[mid-1]&& x<=cumSum[mid+1]){
                return mid;
            }
            else if(cumSum[mid]<x){
                start = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }
}

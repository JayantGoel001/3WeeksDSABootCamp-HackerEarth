import java.util.Scanner;

public class RohanTheMagician {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        int sum =0;
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
            sum+=ar[i];
        }

        int[] RamShyam = new int[sum];
        int k=0;
        for (int i=0;i<n;i++) {
            for (int j =0 ;j<ar[i];j++){
                RamShyam[k++] = i%2==0?0:1;
            }
        }

        int t =scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            x = sum - x;
            int index = RamShyam[x];
            if (index%2==0){
                System.out.println("Ram");
            }else{
                System.out.println("Shyam");
            }
        }
    }

}

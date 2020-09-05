import java.util.Scanner;

public class StringGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String str = scanner.nextLine();
            String[] ar = new String[n];

            for (int j = 0; j < n; j++) {
                ar[j] = scanner.nextLine();
            }

            str = scanner.nextLine();
            int length = str.length();
            int k = 0;
            boolean finded = true;
            for (int j = 0; j < length; j++) {
                int index = find(str.charAt(j),ar[k]);
                if (index==-1){
                    finded = false;
                    System.out.println("No");
                    break;
                }
                ar[k] = ar[k].substring(0,index) + ar[k].substring(index+1);
                k = (k+1)%n;
            }
            if (finded){
                System.out.println("Yes");
            }
        }
    }
    public static int find(char x,String str){
        for (int i = 0; i < str.length(); i++) {
            if(x== str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}

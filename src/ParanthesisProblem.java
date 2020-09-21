import java.util.Scanner;

public class ParanthesisProblem {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        generateParaComb(n,0,0,new StringBuilder());
    }

    private static void generateParaComb(int n, int opening, int closing,StringBuilder str) {
        if (opening==closing && opening == n){
            System.out.println(str.toString());
        }
        if (opening+closing==2*n){
            return;
        }
        if (opening>=closing) {
            str.append(')');
            generateParaComb(n, opening, closing + 1, str);
            str.delete(str.length() - 1, str.length());

            str.append('(');
            generateParaComb(n, opening + 1, closing, str);
            str.delete(str.length() - 1, str.length());
        }
    }
}

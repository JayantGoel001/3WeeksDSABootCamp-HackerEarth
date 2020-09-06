import java.util.Scanner;

public class VishalKeepsBoasting {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String str = sc.nextLine();
            if(isPalindrome(str)){
                System.out.println("SAME");
            }else{
                System.out.println("DIFFERENT");
            }
        }
    }
    public static boolean isPalindrome(String str){
        int len = str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}

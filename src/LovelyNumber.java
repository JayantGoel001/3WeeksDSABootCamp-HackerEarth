import java.util.*;
class LovelyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            System.out.println(GCD(a,b));
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
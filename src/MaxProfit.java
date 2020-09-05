
import java.util.*;
class MaxProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int r = sc.nextInt();
            double max = 0.5;
            int count = 0 ;
            long ar;
            for(int j=0;j<n;j++){
                ar = sc.nextLong();
                if(ar>max){
                    max=ar;
                    count++;
                }
            }
            System.out.println(count*r);
        }
    }
}

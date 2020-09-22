import java.util.LinkedList;
import java.util.Scanner;

public class MonkAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> callingOrder = new LinkedList<>();
        LinkedList<Integer> idealOrder = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            callingOrder.add(x);
        }

        for (int i = 0; i < n; i++) {
            int x= sc.nextInt();
            idealOrder.add(x);
        }
        int count = 0;
        while (idealOrder.size()!=0){
            count++;
            if (idealOrder.get(0).equals(callingOrder.get(0))){
                idealOrder.remove(0);
                callingOrder.remove(0);
                continue;
            }
            int ele = callingOrder.get(0);
            callingOrder.remove(0);
            callingOrder.add(ele);
        }
        System.out.println(count);
    }
}

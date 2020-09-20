import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class ReverseTheList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,LinkedList<Integer>> hashMap= new HashMap<>();
        int[] ar = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i==0){
                hashMap.put(k,new LinkedList<>());
                hashMap.get(k).add(ar[i]);
                continue;
            }

            if (ar[i] % 2 != ar[i - 1] % 2) {
                k++;
                hashMap.put(k, new LinkedList<>());
            }
            hashMap.get(k).add(ar[i]);
        }

        for (int i = 0; i < hashMap.size(); i++) {
            LinkedList<Integer> x = hashMap.get(i);
            if (x.get(0)%2==0){
                reverse(x);
            }
            for (Integer integer : x) {
                System.out.print(integer + " ");
            }
        }

    }
}

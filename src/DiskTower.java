import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DiskTower {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        HashSet<Integer> priorityQueue = new HashSet<>();
        int n = fr.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = fr.nextInt();
            priorityQueue.add(ar[i]);
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int index = getIndexOf(priorityQueue,ar[i]);
//            System.out.println(index);
            hashSet.add(ar[i]);
            if (index == n-1){
                printSet(hashSet,priorityQueue);
                hashSet.clear();
            }
            if (i!=n-1) {
                System.out.println();
            }
        }
        if (!hashSet.isEmpty()){
            printSet(hashSet,priorityQueue);
        }
    }

    private static void printSet(HashSet<Integer> hashSet,HashSet<Integer> pq) {
        int n  =hashSet.size();
        int[] ar = new int[n];
        Iterator<Integer> it = hashSet.iterator();
        int i=0;
        while (it.hasNext()){
            ar[i++] = it.next();
        }
        for (int j = n-1; j >=0; j--) {
            pq.remove(ar[j]);
            System.out.print(ar[j]+" ");
        }
    }

    private static int getIndexOf(HashSet<Integer> priorityQueue, int x) {
        Iterator<Integer> it = priorityQueue.iterator();
        int count=0;
        while (it.hasNext()){
            if (it.next().equals(x)){
                break;
            }
            count++;
        }
        return count;
    }

}

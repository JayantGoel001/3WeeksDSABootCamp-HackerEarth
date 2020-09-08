import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsequenceTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.nextLine();
        for (int i = 0; i < t; i++) {
            str = sc.nextLine();
            ArrayList<String> arrayList = new ArrayList<>();
            getSubSequence(str,arrayList,"");
            Collections.sort(arrayList);

            for (String ele : arrayList) {
                System.out.println(ele);
            }
        }

    }

    private static void getSubSequence(String str, ArrayList<String> arrayList,String subSec) {
        if (str.isEmpty()){
            arrayList.add(subSec);
        }
        else{
            char ch = str.charAt(0);
            getSubSequence(str.substring(1),arrayList,subSec+ch);
            getSubSequence(str.substring(1),arrayList,subSec);
        }
    }
}

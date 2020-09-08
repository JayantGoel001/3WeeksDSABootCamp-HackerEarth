import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.nextLine();
        for (int i = 0; i < t; i++) {
            str = sc.nextLine();
            ArrayList<Character> visited = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println(removedDuplicate(str,visited,stringBuilder,0));
        }
    }
    public static String removedDuplicate(String str, ArrayList<Character> visited,StringBuilder stringBuilder,int i){
        if(str.length() == i){
            return stringBuilder.toString();
        }
        else{
            char x = str.charAt(i);
            if (!visited.contains(x)){
                stringBuilder.append(x);
                visited.add(x);
            }
            return removedDuplicate(str,visited,stringBuilder,++i);
        }

    }
}

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CyraString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            HashSet<Character> hashSet = new HashSet<>();
            int len = str.length();
            for (int j = 0; j < len; j++) {
                char x = str.charAt(j);
                hashSet.add(x);
            }
            int maxLen = hashSet.size()%(1000000000+7);

            ArrayList<String> arrayList = new ArrayList<>();
            generateSubset(str,arrayList,new StringBuilder());
            int count = 0;
            for (String st:arrayList) {
                if (st.length() == maxLen && getHashSet(st).size()==st.length()){
                    count++;
                }
            }
            System.out.println(count%(1000000000+7));
        }
    }

    private static HashSet<Character> getHashSet(String st) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i =0;i<st.length();i++) {
            hashSet.add(st.charAt(i));
        }
        return hashSet;
    }

    private static void generateSubset(String str, ArrayList<String> arrayList, StringBuilder s) {
        if(str.isEmpty()){
            arrayList.add(s.toString());
            return ;
        }
        char ch = str.charAt(0);
        generateSubset(str.substring(1),arrayList,s);
        generateSubset(str.substring(1),arrayList,s.append(ch));
        s.delete(s.length()-1,s.length());
    }

}

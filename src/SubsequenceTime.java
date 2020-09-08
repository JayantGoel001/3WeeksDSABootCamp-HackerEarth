
import java.io.*;
import java.util.*;

class SubsequenceTime {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String str = br.readLine();
            TreeSet<String> arrayList = new TreeSet<>();
            getSubSec(str,arrayList);
            for(String ele:arrayList){
                System.out.println(ele);
            }
        }
    }
    public static void getSubSec(String str,TreeSet<String> arrayList){
        if(str.isEmpty()){
            return;
        }
        if(!arrayList.contains(str))
        {
            arrayList.add(str);
            for(int i=0;i<str.length();i++){
                String t = str;
                t = t.substring(0,i)+t.substring(i+1);
                getSubSec(t,arrayList);
            }
        }

    }
}

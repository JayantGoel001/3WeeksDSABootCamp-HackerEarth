
import java.io.*;
import java.util.*;

class SubsequenceTime {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String str = br.readLine();
            ArrayList<String> arrayList = new ArrayList<String>();
            getSubSec(str,arrayList,"");
            Collections.sort(arrayList);
            for(String ele:arrayList){
                System.out.println(ele);
            }
        }
    }
    public static void getSubSec(String str,ArrayList<String> arrayList,String subsec){
        if(str.isEmpty()){
            if(!arrayList.contains(subsec))
            {
                arrayList.add(subsec);
            }
        }
        else{
            char ch = str.charAt(0);
            getSubSec(str.substring(1),arrayList,subsec);
            getSubSec(str.substring(1),arrayList,subsec+ch);
        }
    }
}

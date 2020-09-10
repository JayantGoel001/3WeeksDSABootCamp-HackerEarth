import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class RDXAndHisAnger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        HashMap<Integer,Character> persons = new HashMap<>();

        for (int i = 0; i <n; i++) {
            persons.put(i,'r');
        }

        int lyricsCount=0;
        int personSavedCounter=0;
        int numberOfSaved= 0;
        while (true){
            if (str.charAt(lyricsCount)=='x' && persons.get(personSavedCounter)=='r'){
                lyricsCount = (lyricsCount+1)%str.length();
            }else{
                if( persons.get(personSavedCounter)=='r'){
                    persons.replace(personSavedCounter,'s');
                    lyricsCount = (lyricsCount+1)%str.length();
                    numberOfSaved++;
                }
            }
            personSavedCounter = (personSavedCounter+1)%n;

            if (numberOfSaved==n-1){
                for (int i = 0; i < n; i++) {
                    if(persons.get(i)=='r'){
                        System.out.println(i+1);
                        break;
                    }
                }
                break;
            }
        }
    }
}

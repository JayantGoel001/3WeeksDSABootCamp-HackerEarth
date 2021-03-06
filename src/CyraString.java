import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CyraString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            HashMap<Character, Integer> hashMap = new HashMap<>();
            int len = str.length();
            for (int j = 0; j < len; j++) {
                char x = str.charAt(j);
                if (!hashMap.containsKey(x)) {
                    hashMap.put(x, 1);
                } else {
                    hashMap.replace(x, hashMap.get(x) + 1);
                }
            }
            Long output = 1L;
            for (HashMap.Entry<Character, Integer> map : hashMap.entrySet()) {
                output*=map.getValue();
                output%=(1000000000+7);
            }
            System.out.println(output%(1000000000+7));
        }
    }
}

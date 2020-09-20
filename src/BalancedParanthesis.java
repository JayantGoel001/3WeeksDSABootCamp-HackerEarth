import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int a = 0; a < n; a++) {

            Stack<Character> stack = new Stack<>();
            String seq = br.readLine();
            HashMap<Character, Character> hashMap = new HashMap<>();
            hashMap.put('(', ')');
            hashMap.put('{', '}');
            hashMap.put('[', ']');
            boolean notBalanced = false;
            for (int i = 0; i < seq.length(); i++) {
                char x = seq.charAt(i);
                if (x == '(' || x == '{' || x == '[') {
                    stack.push(x);
                } else {
                    if (!stack.empty()) {
                        char y = stack.pop();
                        if (x != hashMap.get(y)) {
                            notBalanced = true;
                            System.out.println("NO");
                            break;
                        }
                    } else {
                        notBalanced = true;
                        System.out.println("YES");
                        break;
                    }
                }
            }
            if (!notBalanced) {
                if (stack.empty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}

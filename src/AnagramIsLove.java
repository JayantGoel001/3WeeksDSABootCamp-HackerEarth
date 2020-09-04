import java.util.*;
class AnagramIsLove {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.nextLine();
        for(int i=0;i<n;i++){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            HashMap<Character,Integer> hashMap1 = new HashMap<>();
            HashMap<Character,Integer> hashMap2 = new HashMap<>();
            if(str1.length() == str2.length()){
                for(int j=0;j<str1.length();j++){
                    if (hashMap1.containsKey(str1.charAt(j)))
                    {
                        hashMap1.put(str1.charAt(j), hashMap1.get(str1.charAt(j)) + 1);
                    }
                    else {
                        hashMap1.put(str1.charAt(j),0);
                    }
                    if (hashMap2.containsKey(str2.charAt(j)))
                    {
                        hashMap2.put(str2.charAt(j), hashMap2.get(str2.charAt(j)) + 1);
                    }
                    else {
                        hashMap2.put(str2.charAt(j),0);
                    }
                }
                boolean TRUE = true;
                for(int j=0;j<str1.length();j++){
                    if(hashMap1.get(str1.charAt(j)) != hashMap2.get(str1.charAt(j))){
                        TRUE = false;
                        System.out.println("NO");
                        break;
                    }
                }
                if(TRUE){
                    System.out.println("YES");
                }

            }
            else{
                System.out.println("NO");
            }
        }
    }
}

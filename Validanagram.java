
import java.util.Arrays;
import java.util.Scanner;

public class Validanagram {
    public boolean isAnagram(String a , String b){
        if(a.length() != b.length()){
            return  false;
        }
        char[] ashort = a.toCharArray();
        char[] bshort = b.toCharArray();
        Arrays.sort(ashort);
        Arrays.sort(bshort);
        return Arrays.equals(ashort, bshort);
    }    
        public static void main(String[] args) {
            try(Scanner sc = new Scanner(System.in)){
                String str = sc.nextLine();
                String str1 = sc.nextLine();
                Validanagram validanagram = new Validanagram();
                boolean result = validanagram.isAnagram(str , str1);
                System.out.println(result);
            }
        }
    
}

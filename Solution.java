
import java.util.HashSet;
import java.util.Scanner;

public class Solution{
    public static boolean hasDuplicates(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public class main{
        public static void main(String[] args) {
            try(Scanner sc = new Scanner(System.in)){
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0 ; i<n ; i++){
                    a[i] = sc.nextInt();
                }
                System.out.println(Solution.hasDuplicates(a));
            }
        }
    }
}

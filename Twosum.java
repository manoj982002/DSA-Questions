
import java.util.Arrays;
import java.util.Scanner;


public class Twosum {
    public int[] sum(int[] nums , int target){
        for(int i = 0 ; i<nums.length ; i++){
            for(int j =i+1 ; j<nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i<n ; i++){
                a[i] = sc.nextInt();
            }
            System.out.println("enter the target");
            int t = sc.nextInt();

            Twosum twosum = new Twosum();
            System.out.println(Arrays.toString((twosum.sum(a, t))));
        }
    }
}

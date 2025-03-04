import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Frequence {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(nums, 0) + 1);
        }
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[] { entry.getValue(), entry.getKey() });
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i)[1];

        }
        return result;
    }
    public static void main(String[] args) {
        Frequence frequence = new Frequence();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("enter the k");
            int k = sc.nextInt();
            System.out.println("Enter the values in array");

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] result = frequence.topKFrequent(a, k);
            System.out.println(Arrays.toString(result));
        }
    }
}

import java.util.*;

public class Group_anagrams {
    public List<List<String>> getAnagrams(String[] str) {
        Map<String, List<String>> result = new HashMap<>();
        for (String s : str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            result.putIfAbsent(sortedS, new ArrayList<>());
            result.get(sortedS).add(s);
        }
        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of words: ");
            int n = sc.nextInt();
            sc.nextLine(); 

            String[] a = new String[n];
            System.out.println("Enter words: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLine();
            }

            Group_anagrams getAnagrams = new Group_anagrams();
            List<List<String>> groupAnagrams = getAnagrams.getAnagrams(a);

            System.out.println("\nGrouped Anagrams:");
            for (List<String> group : groupAnagrams) {
                System.out.println(group);
            }
        }
    }
}

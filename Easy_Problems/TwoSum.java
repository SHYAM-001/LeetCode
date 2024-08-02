import java.util.*;

public class TwoSum {
    public static int[] sum(int[] array, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        int complement;
        for (int i = 0; i < array.length; i++) {
            hash.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            complement = k - array[i];
            if (hash.containsKey(complement) & hash.get(complement) != i) {
                return new int[] { i, hash.get(complement) };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int k = sc.nextInt();
        int[] array = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            array[i] = Integer.parseInt(inputs[i]);
        }
        int[] result = sum(array, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}

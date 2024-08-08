import java.util.*;

public class LongestCommonPrefix {
    public static String Commonprefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        int n = v.length;
        String first = v[0];
        String last = v[n - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        String result = Commonprefix(inputs);
        System.out.println(result);
    }
}

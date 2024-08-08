import java.util.*;

public class LongestSubStringWiOutRptChar {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        int left = 0;
        int maxlength = 0;

        for (int right = 0; right < s.length(); right++) {
            if ((!m.containsKey(s.charAt(right))) || ((m.get(s.charAt(right)) < left))) {
                m.put(s.charAt(right), right);
                maxlength = Math.max(maxlength, (right - left + 1));
            } else {
                left = m.get(s.charAt(right)) + 1;
                m.put(s.charAt(right), right);
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(input));
    }
}
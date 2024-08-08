import java.util.*;

public class LongestSubStringWiOutRptChar {

    // SetMethod
    public static int SetMethod(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxlength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxlength = Math.max(maxlength, right - left + 1);
            } else {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }
        return maxlength;
    }

    // HashMapMethod
    public static int HashMapMethod(String s) {
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

    // Integer Array Method
    public static int IntegerArrayMethod(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128]; // ASCII character set
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] > left) {
                left = charIndex[s.charAt(right)];
            }
            charIndex[s.charAt(right)] = right + 1;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(HashMapMethod(input));
    }
}
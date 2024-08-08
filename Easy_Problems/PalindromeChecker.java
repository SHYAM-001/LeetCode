import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        } else {
            int num = n;
            int reverse = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                reverse = reverse * 10 + lastDigit;
                num = num / 10;
            }
            return (reverse == n) ? true : false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isPalindrome(n);
        System.out.println(result);
    }
}

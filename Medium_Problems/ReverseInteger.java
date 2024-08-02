import java.util.*;

public class ReverseInteger {
    public static int reverse(int x) {
        int num = Math.abs(x);
        int result = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num = num / 10;
        }
        return (x < 0) ? -result : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println(result);
    }
}
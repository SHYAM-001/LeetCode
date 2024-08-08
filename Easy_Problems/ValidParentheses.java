import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                stack.push(i);
            } else {
                if (stack.isEmpty() || (i == ')' && stack.peek() != '(') || (i == '}' && stack.peek() != '{')
                        || (i == ']' && stack.peek() != '[')) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = isValid(s);
        System.out.println(result);
    }
}
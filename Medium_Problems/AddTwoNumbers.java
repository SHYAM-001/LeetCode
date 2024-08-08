import java.util.*;

public class AddTwoNumbers {
    public static LinkedList<Integer> addition(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

        // Add digits from both lists
        while (!list1.isEmpty() || !list2.isEmpty() || carry != 0) {
            int digit1 = !list1.isEmpty() ? list1.removeFirst() : 0;
            int digit2 = !list2.isEmpty() ? list2.removeFirst() : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            result.add(digit);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input1 = sc.nextLine().split(" ");

        String[] input2 = sc.nextLine().split(" ");

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for (String s : input1) {
            list1.add(Integer.parseInt(s));
        }

        for (String s : input2) {
            list2.add(Integer.parseInt(s));
        }

        LinkedList<Integer> result = addition(list1, list2);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

import java.util.Scanner;

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class List {
    ListNode head;
    ListNode tail;

    List() {
        this.head = null;
        this.tail = null;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertEnd(int data) {
        ListNode temp = new ListNode(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }
}

public class MergeTwoSortedList {
    // Logic to Merge Two Sorted List
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    // This is the part of the getting the input and Setting it into the LinkedList
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs for the first list
        String[] input1 = sc.nextLine().split(" ");
        // Read inputs for the second list
        String[] input2 = sc.nextLine().split(" ");

        List list1 = new List();
        List list2 = new List();

        for (String s : input1) {
            list1.insertEnd(Integer.parseInt(s));
        }
        for (String s : input2) {
            list2.insertEnd(Integer.parseInt(s));
        }

        // Merge the two lists
        ListNode result = mergeTwoLists(list1.head, list2.head);

        // Display the merged list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();

        sc.close();
    }
}

// This is not the best approach it takes O(n) time and space optimized one is still reverse 2nd half that takes O(n) time but O(1) space

import java.util.Stack;

class LinkedList {

    static class Node {

        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
}

public class PalindromeProblem {

    public static boolean isPalindrome(LinkedList list) {

        Stack<Character> s = new Stack<>();

        LinkedList.Node temp = list.head;

        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = list.head;

        while (!s.isEmpty() && temp != null) {
            if (s.peek() != temp.data) {
                return false;
            }
            s.pop();
            temp = temp.next;
        }
        return (s.isEmpty() && (temp == null));
    }

    public static void main(String args[]) {

        LinkedList list = new LinkedList();

        list.addFirst('A');
        list.addFirst('B');
        list.addFirst('C');
        list.addFirst('B');
        list.addFirst('A');

        System.out.println(isPalindrome(list));

        LinkedList list2 = new LinkedList();

        list2.addFirst('A');
        list2.addFirst('B');

        System.out.println(isPalindrome(list2));

    }
}

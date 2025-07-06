package LL.PracticeSession;

public class MergeKSortedLists {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node left, Node right) {
        Node mergeList = new Node(-1);

        Node temp = mergeList;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergeList.next;
    }

    public static Node createList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        int n = arr.length;
        int i = 1;
        while (i < n) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
            i++;
        }

        return head;
    }

    public static Node mergeKList(Node[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        int last = lists.length - 1;

        while (last != 0) {
            int i = 0;
            int j = last;
            while (i < j) {
                lists[i] = merge(lists[i], lists[j]);
                i++;
                j--;
                if (i >= j) {
                    last = j;
                }
            }
        }
        return lists[0];
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {

        Node[] lists = new Node[3];

        lists[0] = createList(new int[]{1, 4, 6});
        lists[1] = createList(new int[]{2, 5, 6});
        lists[2] = createList(new int[]{0, 9});

        Node newNode = mergeKList(lists);
        printList(newNode);

    }

}

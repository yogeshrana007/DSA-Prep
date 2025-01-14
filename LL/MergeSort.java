package LL;

import java.util.LinkedList;

//-----------------------------Using Java FrameWork----------------------------->
public class MergeSort {

    public static LinkedList<Integer> getMid(LinkedList<Integer> ll) {
        int midIndex = ll.size() / 2;
        LinkedList<Integer> rightPart = new LinkedList<>();
        while (ll.size() > midIndex) {
            rightPart.addFirst(ll.removeLast());
        }
        return rightPart;
    }

    public static LinkedList<Integer> mergeSort(LinkedList<Integer> ll) {
        //base
        if (ll.size() <= 1) {
            return ll;
        }

        // find mid and split list(divide into two half)
        LinkedList<Integer> rightPart = getMid(ll);
        //Recursively call on both halfs
        LinkedList<Integer> sortedLeft = mergeSort(ll);
        LinkedList<Integer> sortedRight = mergeSort(rightPart);

        //merge sorted halves
        return merge(sortedLeft, sortedRight);
    }

    public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> mergedList = new LinkedList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.peekFirst() <= right.peekFirst()) {
                mergedList.add(left.removeFirst());
            } else {
                mergedList.add(right.removeFirst());
            }
        }
        while (!left.isEmpty()) {
            mergedList.add(left.removeFirst());
        }
        while (!right.isEmpty()) {
            mergedList.add(right.removeFirst());
        }

        return mergedList;
    }

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(3);
        ll.add(7);
        ll.add(5);
        ll.add(6);
        ll.add(4);
        ll.add(12);
        ll.add(2);
        ll.addFirst(9);
        System.out.println(ll);
        ll = mergeSort(ll);
        System.out.println(ll);
    }
}
//<>---------------------------using scrach (mattlb khud se bnaye gye method and class means Data structure)------------------->
/*
public class MergeSort {

    public static class Node {
        int data;
        Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
    }
    public static Node head;

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node mergeSort(Node head) {
        // base
        if (head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);

        // left and right ms
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }

    public static Node merge(Node left, Node right) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
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
        return mergeLL.next;
    }
    public static void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        head = new Node(1);
        head.next=new Node(4);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        ll.addFirst(5);
        ll.addLast(9);
        ll.addLast(11);
        ll.addLast(2);
        ll.addLast(8);
        printLL();
        mergeSort(head);
        //System.out.println(head);
        printLL();
    }
}
 */

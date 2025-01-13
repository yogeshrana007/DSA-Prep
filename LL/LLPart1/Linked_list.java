package LL.LLPart1;

public class Linked_list {
    
    public static class Node {

        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add at first position (head)
    public void addFirst(int data) {
        Node newNode = new Node(data); //------------>creating newNode (evry time even if LL is empty)
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head; //----------------> newNode head ko point kr rhi

        head = newNode; //--------------> assigning newNode as head;

    }

    // adding at last position(tail)
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // add at index idx
    public void addAtMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //printing LinkedList
    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // search node (key) using recursion
    public int searchUsingRec(int key, int idx, Node temp) {
        if (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            return searchUsingRec(key, idx + 1, temp.next);
        }
        return -1;
    }

    // removings first node
    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (head == tail && head != null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    // Removing last node
    public int removeLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size() - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;   // or---tail.data
        prev.next = null;
        tail = prev;
        return val;
    }

    // Size of LinkedList
    public int size() {
        Node temp = head;
        int sz = 0;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        return sz;
    }

    // Reversing LL means head ban jayega tail and tail ban jayega head (and direction of link bhi change hogi sabhi node ki)
    public void reverseLL() {
        Node curr = tail = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void delete_Nth_From_Last(int n) {
        if (n == size()) {
            removeFirst();   // head=head.next;
            return;
        }
        int i = 1;
        Node prev = head;
        int isToFind = size() - n;  // Nth from last means size-n from first
        while (i < isToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // Using slow-fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // checking if LL is Palindrome or Not
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step-1 find mid
        Node midNode = findMid(head);

        // step-2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;  // right half ka head
        Node left = head;

        // step-3 check are left half and right half are equal or not
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void clearList(){
        head=tail=null;
    }

    public static void main(String args[]) {
        Linked_list ll = new Linked_list();

        //ll.printLL();
        ll.addFirst(1);
        //ll.printLL();

        ll.addFirst(2);
        //ll.printLL();

        ll.addLast(3);
        //ll.printLL();

        ll.addLast(2);
        //ll.printLL();

        ll.addAtMiddle(1, 3);
        ll.printLL();

        //System.out.println(ll.searchUsingRec(9, 0, head));
        //ll.removeFirst();
        //ll.removeLast();
        //ll.reverseLL();
        //ll.delete_Nth_From_Last(5);
        //ll.printLL();
        //System.out.println(ll.isPalindrome());
        //ll.clearList();
        ll.printLL();
    }
}


package LL;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        public static Node head;
        public static Node tail;

        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }

        public int removeFirst(){
            int val=head.data;
            head=head.next;
            head.prev=null;
            return val;
        }
        public int removeLast(){
            int val=tail.data;
            tail=tail.prev;
            tail.next=null;
            return val;
        }
        public void printLL(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" <-> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    public static void main(String args[]){
        DoublyLL dl=new DoublyLL();
        dl.addFirst(2);
        dl.addFirst(1);

        //dl.printLL();

        dl.addLast(3);
        dl.addLast(4);
        
        // dl.printLL();
        // dl.removeFirst();
        dl.printLL();

        dl.removeLast();
        dl.printLL();
    }
}

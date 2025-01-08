package LinkedList;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode=new Node(data); //------------>creating newNode (evry time even if LL is empty)
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head; //----------------> newNode head ko point kr rhi

        head=newNode; //--------------> assigning newNode as head;

    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void addAtMiddle(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        Node newNode=new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int searchUsingRec(int key,int idx,Node temp){
        if(temp!=null){
            if(temp.data==key){
                return idx;
            }
            return searchUsingRec(key, idx+1, temp.next);
        }
        return -1;
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();

        ll.printLL();

        ll.addFirst(1);
        ll.printLL();

        ll.addFirst(2);
        ll.printLL();

        ll.addLast(3);
        ll.printLL();

        ll.addLast(4);
        ll.printLL();

        ll.addAtMiddle(9, 3);
        ll.printLL();

        System.out.println(ll.searchUsingRec(9, 0, head));
    }
}

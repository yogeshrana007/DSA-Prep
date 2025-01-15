package LL;

public class ZigZagLL{
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
    public static Node getMid(Node head){
        Node slow= head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public static void zigZag(Node head){
        // find mid
        Node midNode=getMid(head);
        
        //reverse 2nd half
        Node curr=midNode.next;
        Node prev=null;
        Node next;
        midNode.next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        
        // assiginig
        while((right!=null)&&(left!=null)){
            
            Node nextL=left.next;        
            left.next=right;
            Node nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
        
    }
    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
                    System.out.print(temp.data+"->");
                    temp=temp.next;
        }
                System.out.println("null");
    }
    public static void main(String args[]){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
       // head.next.next.next.next.next=new Node(6);
        printLL(head);
        zigZag(head);
        printLL(head);
        
    }
}
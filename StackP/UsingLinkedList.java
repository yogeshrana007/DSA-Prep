package StackP;

class Stack{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public boolean isEmpty(){
        return head==null;
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    public int peek(){
        if(isEmpty()) {return -1;}
        return head.data;
    }
}
public class UsingLinkedList {
    public static void main(String args[]){
        Stack s=new Stack();
        System.out.println(s.isEmpty());
        s.push(1);
       // System.out.println(s.peek());
        s.push(2);

        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

package LL.LLPart2;

public class DetectingCycle {
    public static class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static boolean isCycle(){ //------> Floyd's Cycle Finding Algorithm
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true; // true means is Cycle
            }
        }
        return false;
    }

    public static void removeCycle(){
        //first detect is cyle present if not
        Node slow = head;
        Node fast = head;
        boolean isCycle=isCycle();
        while(fast!=null&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCycle=true;
                break;
            }
        }
        if(isCycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        if(prev==null){
            prev=slow;
            while(prev.next!=slow){
                prev=prev.next;
            }
        }
        prev.next=null;
    }
    public static void printLL(){
        // first need to find the size
        // int size=0;
        // Node temp=head;
        // while(temp!=null){
        //     temp=temp.next;
        //     size++;
        // }
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
        head.next.next.next=head;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        printLL();
    }
}
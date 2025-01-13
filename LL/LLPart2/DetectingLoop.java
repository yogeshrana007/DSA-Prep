package LL.LLPart2;
import LL.LLPart1.Linked_list;
import LL.LLPart1.Linked_list.Node;

public class DetectingLoop {
    
    public static Linked_list.Node head;
    public static Linked_list.Node tail;

    public static boolean isLoop(){
        Linked_list.Node slow=head;
        Linked_list.Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        //DetectingLoop dl = new DetectingLoop();
        Linked_list ll=new Linked_list();
        // ll.clearList();
        // ll.addFirst(1);
        // ll.addFirst(4);
        // ll.addFirst(8);
        // ll.printLL();

        DetectingLoop dl=new DetectingLoop();

        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;

        System.out.println(isLoop());
        //ll.printLL();
    }
}

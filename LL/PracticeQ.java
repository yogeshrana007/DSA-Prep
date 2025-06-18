package LL;

class LinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
        public Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public int size() {
        Node temp = head;
        int sz = 0;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        return sz;
    }
    public void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class PracticeQ {
    
    // Q1
    public static boolean comparison(LinkedList list1,LinkedList list2){
        LinkedList.Node temp1=list1.head;

        while(temp1!=null){
            LinkedList.Node temp2=list2.head;
            while(temp2!=null){
                if(temp1==temp2){
                    return true;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return false;
    }

    // Q2
    public static void delete_N_Nodes_After_M_Node(LinkedList list,int m, int n){
        LinkedList.Node curr=list.head;
        while(curr!=null){
            for(int i=1;i<m&&curr!=null;i++){
                curr=curr.next;
            }
            if(curr==null){
                break;
            }
            LinkedList.Node temp=curr.next;
            for(int j=0;j<n&&temp!=null;j++){
                temp=temp.next;
            }
            curr.next=temp;
            curr=temp;
        }
    }

    //Q-3
    public static void swapNode(LinkedList list,int x,int y){
        LinkedList.Node prevX=null,curX=list.head;
        while(curX!=null&&curX.data!=x){
            prevX=curX;
            curX=curX.next;
        }
        LinkedList.Node prevY=null,curY=list.head;
        while(curY!=null&&curY.data!=y){
            prevY=curY;
            curY=curY.next;
        }
        if(prevX==prevY){
            return;
        }
        if(prevX!=null){
            prevX.next=curY;
        }else{
            list.head=curY;
        }
        if(prevY!=null){
            prevY.next=curX;
        }else{
            list.head=curX;
        }

        LinkedList.Node temp=curX.next;
        curX.next=curY.next;
        curY.next=temp;
    }

    // Q-4
    public static void oddEven(LinkedList list){
        LinkedList.Node temp=list.head;
        int count=0;
        while(temp!=null){
            if(temp.data%2!=0){
                count++;
            }
            
        }
    }
    public static void main(String args[]){

        //Q1
        LinkedList list1=new LinkedList();
        list1.addFirst(4);
        list1.addFirst(3);
        list1.addFirst(2);
        list1.addFirst(1);
        list1.printLL();
        
        LinkedList list2=new LinkedList();
        list2.addFirst(3);
        list2.addFirst(6);
        list2.addFirst(5);
        list2.addFirst(7);
        
        list2.printLL();
        //comparison(fl,sl);
        System.out.println(comparison(list1, list2));
        

        //Q2
        // LinkedList list=new LinkedList();
        // list.addFirst(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(4);
        // list.addLast(5);
        // list.addLast(6);
        // list.addLast(7);
        // list.addLast(8);

        // //list.printLL();
        // //delete_N_Nodes_After_M_Node(list, 2, 2);
        // list.printLL();
        // swapNode(list,2,5);
        // list.printLL();
    }
}

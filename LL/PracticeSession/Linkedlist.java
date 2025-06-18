package LL.PracticeSession;

class Node{
    public int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Linkedlist {
    Node head;
    Node tail;

    public Linkedlist(int head){
        this.head=new Node(head);
        this.tail=this.head;
    }

    public void add(int data){
        Node curr=this.head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new Node(data);
        tail=curr.next;
    }
    public void addNode(Node newNode){
        Node curr=this.head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        tail=newNode;
    }
    public int size(){
        int size=0;
        Node curr=this.head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        return size;
    }
    public void printLL(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node curr=this.head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    //Q1
    public static boolean isCommon(Linkedlist list1,Linkedlist list2){
        Node curr1=list1.head;
        Node curr2=list2.head;
        
        int len1=list1.size();
        int len2=list2.size();
        int d=Math.abs(len1-len2);
        if(len1>len2){
            while(d>0){
                curr1=curr1.next;
                d--;
            }
        }else{
            while(d>0){
                curr2=curr2.next;
                d--;
            }
        }
        while(curr1!=null&&curr2!=null){
            if(curr1==curr2){
                return true;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return false;
    }
    //Q-2
    public static void delete_N_Nodes_After_M_Node(Linkedlist list,int m,int n){
        Node curr=list.head;

        while(curr!=null){
            for(int i=1;i<m&&curr!=null;i++){
                curr=curr.next;
            }
            if(curr==null)break;
            Node temp=curr.next;
            for(int j=0;j<n&&temp!=null;j++){
                temp=temp.next;
            }
            curr.next=temp;
            curr=temp;
        }
    }
    // Q-3
    public void swapNodes(int x,int y){
        Node curX=this.head;
        Node curY=this.head;
        Node preX=null,preY=null;
        while(curX!=null&&curX.data!=x){
            preX=curX;
            curX=curX.next;
        }
        while(curY!=null&&curY.data!=y){
            preY=curY;
            curY=curY.next;
        }
        if(preX==null){
            this.head=curY;
        }else{
            preX.next=curY;
        }
        if(preY==null){
            this.head=curX;
        }
        else{
            preY.next=curX;
        }
        Node temp=curX.next;
        curX.next=curY.next;
        curY.next=temp;
    }
    //  Q-4
    public void oddAfterEven(){
        Node end=this.tail;
        Node prev=null;
        Node curr=this.head;
        while(curr!=end){
            if(curr.data%2!=0){
                if(prev!=null){
                    prev.next=curr.next;
                }else{
                    head=curr.next;
                }
                tail.next=curr;
                tail=curr;
                curr=curr.next;
                tail.next=null;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        if(curr.data%2!=0){
            if(prev!=null){
                prev.next=curr.next;
            }else{
                head=curr.next;
            }
            tail.next=curr;
            curr.next=null;
        }
    }
    // Q-5
    public static Linkedlist mergeList(Linkedlist l1,Linkedlist l2,Linkedlist l3){
        Node curr1=l1.head;
        Node curr2=l2.head;
        Node curr3=l3.head;
        Linkedlist newList=new Linkedlist(-1);
        while(curr1!=null&&curr2!=null){
            if(curr1.data<=curr2.data){
                newList.add(curr1.data);
                curr1=curr1.next;
            }else{
                newList.add(curr2.data);
                curr2=curr2.next;
            }
        }
        while(curr1!=null){
            newList.add(curr1.data);
            curr1=curr1.next;
        }
        while(curr2!=null){
            newList.add(curr2.data);
            curr2=curr2.next;
        }
        Linkedlist newSortedList=newList;
        Node curr4=newList.head;
        while(curr4!=null&&curr3!=null){
            if(curr4.data<=curr3.data){
                newSortedList.add(curr4.data);
                curr4=curr4.next;
            }else{
                newSortedList.add(curr3.data);
                curr3=curr3.next;
            }
        }
        while(curr4!=null){
            newSortedList.add(curr4.data);
            curr4=curr4.next;
        }
        while(curr3!=null){
            newSortedList.add(curr3.data);
            curr3=curr3.next;
        }
        return newSortedList;
    }
    public static void main(String args[]){

        Node commonNode=new Node(6);
        Linkedlist list=new Linkedlist(1);
        list.add(2);   
        list.add(3);
        list.addNode(commonNode);
        list.add(7);
        //list.printLL();

        Linkedlist list2=new Linkedlist(4);
        list2.add(5);
        list2.addNode(commonNode);
        list2.add(7);

        //System.out.println(isCommon(list, list2));

        //Q-2
        Linkedlist list3 =new Linkedlist(1);
        list3.add(2);
        list3.add(4);
        list3.add(5);
        list3.add(3);
        list3.add(4);
        list3.add(6);
        //list3.printLL();
        // delete_N_Nodes_After_M_Node(list3, 2, 2);
        // list3.printLL();

        //Q-3
        Linkedlist ll=new Linkedlist(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        // ll.printLL();
        // ll.swapNodes(2, 4);
        // ll.printLL();

        //Q-4
        Linkedlist list4=new Linkedlist(1);
        list4.add(2);
        list4.add(4);
        list4.add(5);
        list4.add(8);
        list4.add(7);
        // list4.oddAfterEven();
        // list4.printLL();

        // Q-5
        Linkedlist list5=new Linkedlist(1);
        list5.add(3);
        Linkedlist list6=new Linkedlist(2);
        list6.add(5);
        Linkedlist list7=new Linkedlist(4);
        list7.add(6);
        list5=mergeList(list5, list6, list7);
        list5.printLL();
    }
}

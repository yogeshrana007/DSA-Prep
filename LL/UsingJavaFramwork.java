package LL;
import java.util.LinkedList;

public class UsingJavaFramwork {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<>();

        ll.addLast(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}

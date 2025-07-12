
import java.util.Deque;
import java.util.LinkedList;

public class DequeImplement {

    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);

        System.out.println(deque);

        deque.addLast(3);
        deque.addLast(4);

        System.out.println("Original deque " + deque);

        System.out.println("first " + deque.getFirst());
        System.out.println("last " + deque.getLast());

        System.out.println("removed First " + deque.removeFirst());
        System.out.println("removed Last " + deque.removeLast());

        System.out.println("After deletion " + deque);

    }
}


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QUsingFramework {

    public static void main(String args[]) {

        // using LinkedList class
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        // using ArrayDeque as class
        Queue<Integer> q2 = new ArrayDeque<>();

        q2.add(4);
        q2.add(5);
        q2.add(6);

        while (!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.remove();
        }
    }
}

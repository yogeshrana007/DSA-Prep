
import java.util.*;

public class ReverseQueue {

    public static Queue<Integer> reversedQ(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        return q;
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        Queue<Integer> result = reversedQ(q);

        while (!result.isEmpty()) {
            System.out.print(result.remove() + " ");
        }
    }
}

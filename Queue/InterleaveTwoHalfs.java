
import java.util.Queue;
import java.util.LinkedList;

public class InterleaveTwoHalfs {

    // even length Queue
    public static Queue<Integer> interleaveHalf(Queue<Integer> q) {

        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();

        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

        return q;
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        // q.add(11);

        Queue<Integer> result = interleaveHalf(q);

        while (!result.isEmpty()) {
            System.out.print(result.remove() + " ");
        }
    }
}

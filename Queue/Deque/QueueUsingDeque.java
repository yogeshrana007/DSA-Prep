package Queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {

    static class Queue {

        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return deque.removeFirst();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return deque.getFirst();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}

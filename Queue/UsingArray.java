
public class UsingArray {

    static class Queue {

        int[] arr;
        int size;
        int rear;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //isEmpty
        public boolean isEmpty() {
            return rear == -1;
        }

        // add O(1)
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full!");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        //peek O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue q1 = new Queue(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);

        Queue q2 = new Queue(10);
        q2.add(4);
        q2.add(5);
        q2.add(6);

        // System.out.println(q1.peek());
        // System.out.println(q2.peek());
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}

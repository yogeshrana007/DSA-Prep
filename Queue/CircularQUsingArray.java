
public class CircularQUsingArray {

    public static class Queue {

        int[] arr;
        int rear;
        int size;
        int front;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // is Empty
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (isEmpty()) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int result = arr[front];

            //last element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;

            }
            return result;
        }

        //peek O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String args[]) {

        Queue q = new Queue(10);

        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);

        // System.out.println(q.peek());
        System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        q.add(11);
        int i = q.front;
        while (i <= q.rear) {
            System.out.print(q.peek() + " ");
            q.remove();
            i++;
        }
        System.out.println();
        i = 0;
        while (i < 10) {
            System.out.print(q.peek() + " ");
            q.remove();
            i++;
        }
    }
}

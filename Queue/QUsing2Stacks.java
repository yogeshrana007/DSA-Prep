
import java.util.Stack;

public class QUsing2Stacks {

    static class Queue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();


        /* 1. First approach which takes O(n) on adding and O(1) on remove and peek() */
 /*
            // O(1)
            public boolean isEmpty() {
                return s1.isEmpty();
            }

            // add O(n)
            public void add(int data) {

                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }

                s1.push(data);

                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }

            // remove
            public int remove() {
                if (s1.isEmpty()) {
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                return s1.pop();
            }

            // peek
            public int peek() {
                if (s1.isEmpty()) {
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                return s1.peek();
            }
         */

 /* 2. Second approach which take O(1) to add and O(n) on remove & peek */
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            s1.push(data);
        }

        public int remove() {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int front = s2.pop();

            while (!s2.isEmpty()) {
                s1.push((s2.pop()));
            }

            return front;
        }

        public int peek() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int front = s2.peek();

            while (!s2.isEmpty()) {
                s1.push((s2.pop()));
            }

            return front;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

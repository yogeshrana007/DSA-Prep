package Heap;

import java.util.ArrayList;

public class Implementation {

    // i m doing all methods & operations based on min heap
    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {

            //adding data to arr
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            // fixing heap if child value is smaller then swap it with parent
            while (arr.size() > 1 && arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Heap is Empty!!");
                return -1;
            }
            return arr.get(0);
        }

        // delete in heap
        public int remove() {
            if (isEmpty()) {
                System.out.println("Heap is Empty!!");
                return -1;
            }
            int data = arr.get(0);

            arr.set(0, arr.get(arr.size() - 1));

            arr.remove(arr.size() - 1);

            heapify(0);

            return data;
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                right = minIdx;
            }

            if (minIdx != i) {

                //swap
                int temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(i));
                arr.set(i, temp);

                heapify(minIdx);
            }
        }

        public void printHeap() {
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Heap heap = new Heap();
        heap.add(1);
        heap.add(5);
        heap.add(3);
        heap.add(2);
        heap.add(4);

        System.out.print("Heap values : ");
        heap.printHeap();

        System.out.println("peek/minimum : " + heap.peek());

        System.out.println("delete : " + heap.remove());

        System.out.print("After deletion values: ");
        heap.printHeap();
    }
}

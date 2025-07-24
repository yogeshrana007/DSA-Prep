package BST;

public class PrintInRange {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        // left side
        if (root.data > val) {
            root.left = insert(root.left, val);
        } // insert on right side when
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // printing all nodes which belongs to [n1, n2]
    public static void printInRange(Node root, int n1, int n2) {
        if (root == null) {
            return;
        }
        if (root.data >= n1 && root.data <= n2) {
            printInRange(root.left, n1, n2);
            System.out.print(root.data + " ");
            printInRange(root.right, n1, n2);
        } else if (root.data > n1) {
            printInRange(root.left, n1, n2);
        } else {
            printInRange(root.right, n1, n2);
        }
    }

    public static void main(String args[]) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        /*
         *        5
         *       / \
         *      1   7
         *       \
         *        3
         *       / \
         *      2   4
         */
        printInRange(root, 2, 6);
    }
}

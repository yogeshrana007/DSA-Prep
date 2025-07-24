package BST;

public class SearchInBST {

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

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }
        // found
        if (root.data == target) {
            return true;
        }
        if (root.data < target) {
            return search(root.right, target);
        } else {
            return search(root.left, target);
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
        if (search(root, 6)) {
            System.out.println("Found!!");
        } else {
            System.out.println("Not found!!");
        }
    }
}

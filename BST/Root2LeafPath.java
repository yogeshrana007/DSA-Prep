package BST;

import java.util.ArrayList;

public class Root2LeafPath {

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

    public static void root2LeafPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        }

        root2LeafPath(root.left, path);
        root2LeafPath(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            if (i == path.size() - 1) {
                System.out.print(path.get(i));
                break;
            }
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("");
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
        root2LeafPath(root, new ArrayList<>());
    }
}

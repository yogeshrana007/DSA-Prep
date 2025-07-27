package BST;

public class DeleteNode {

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

    // delete Node
    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.data < key) {
            root.right = deleteNode(root.right, key);
        } else {

            // case: 1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case: 2 ( 1 child)
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case: 3 (2 children)
            Node IS = InorderSuccNode(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        return root;
    }

    // finding Inorder successor (for replacing with key)
    public static Node InorderSuccNode(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String args[]) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        /*
         *        5
         *       / \
         *      1   7
         *       \
         *        3
         *       / \
         *      2   4
         */
        deleteNode(root, 4);
        inorder(root);
    }
}

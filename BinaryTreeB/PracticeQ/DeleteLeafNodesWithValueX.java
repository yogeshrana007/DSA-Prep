
public class DeleteLeafNodesWithValueX {

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

    public static void preorder(Node root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node deleteLeafNodesWithValue(Node root, int value) {
        if (root == null) {
            return null;
        }

        root.left = deleteLeafNodesWithValue(root.left, value);
        root.right = deleteLeafNodesWithValue(root.right, value);

        if (root.data == value && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(6);

        /*
         *          1
         * `       /  \
         *       2     3
         *      / \   / \
         *     6   5 6   6
         */
        preorder(root);
        System.out.println("");
        root = deleteLeafNodesWithValue(root, 6);
        preorder(root);
    }
}

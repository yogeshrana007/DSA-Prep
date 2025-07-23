
public class IsUnivalued {

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

    public static boolean isUnivalued(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }

        return isUnivalued(root.left) && isUnivalued(root.right);
    }

    public static void main(String args[]) {

        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(2);

        /*
         *          2
         * `       /  \
         *       2     2
         *      / \   / \
         *     2   2 2   2
         */
        if (isUnivalued(root)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

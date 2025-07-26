
public class SortedArray2BalanceTree {

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

    public static Node insert(int[] arr, int start, int end) {

        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);

        root.left = insert(arr, start, mid - 1);
        root.right = insert(arr, mid + 1, end);

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

    public static void main(String args[]) {
        int[] values = {3, 5, 6, 8, 9, 10, 11};
        Node root = null;

        root = insert(values, 0, values.length - 1);

        inorder(root);

    }
}

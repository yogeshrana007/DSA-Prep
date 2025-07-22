package BinaryTreeB;

import java.util.ArrayList;

public class LowestCommonAncestor {

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

    /* Approach - 1  TC- O(n)  SC- O(n) */
    // lca -> lowest common ancestor  O(n^2)
    public static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        boolean found1 = getPath(root, n1, path1);
        boolean found2 = getPath(root, n2, path2);

        if (!found1 || !found2) {
            System.out.println("One or both nodes not present in the tree.");
            return null;
        }

        int i = 0;
        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
            i++;
        }
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }


    /* Approach - 2  TC - O(n) SC - O(h) (only due to resursive call) */
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        // leftLca = valid and rightLca = null  ---> in which from right part no node found and both node found left side
        if (rightLca == null) {
            return leftLca;
        }

        // leftLca = null and rightLca = valid
        if (leftLca == null) {
            return rightLca;
        }

        // if both right & left part have value (one on left another in right)
        return root;
    }

    public static void main(String args[]) {

        Node root = new Node(0);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
         *          1
         * `       /  \
         *       2     3
         *      / \   / \
         *     4   5 6   7
         */
        System.out.println("Approach-1 : " + lca(root, 4, 5).data);

        System.out.println("Approach-2 : " + lca2(root, 4, 5).data);
    }
}

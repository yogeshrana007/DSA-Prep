
public class BinaryTreeOperations {

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

    static class BinaryTree {

        int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left); // left height means height of left subtree
            int rightHeight = height(root.right); // height of right sub tree

            return Math.max(leftHeight, rightHeight) + 1; // the maximum of the L & R and add 1 for root
        }

        public int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCount = countNodes(root.left); // Number of nodes in left subTree
            int rightCount = countNodes(root.right); // Number of nodes in right subTree

            return leftCount + rightCount + 1; // height from L + R and 1 for root node
        }

        public int sum(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = sum(root.left);
            int rightSum = sum(root.right);

            return leftSum + rightSum + root.data;
        }

        public int diameter(Node root) { //O(n^2)
            if (root == null) {
                return 0;
            }

            int leftDiameter = diameter(root.left);
            int leftHeight = height(root.left);

            int rightDiameter = diameter(root.right);
            int rightHeight = height(root.right);

            return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
        }
    }

    public static void main(String args[]) {

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println("Height " + tree.height(root));

        System.out.println("Nodes " + tree.countNodes(root));

        System.out.println("sum " + tree.sum(root));

        System.out.println("diameter " + tree.diameter(root));
    }
}


public class SubtreeOfTree {

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

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            };
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    public static void main(String args[]) {

        //First tree
        Node treeRootNode = new Node(1);

        //left part
        treeRootNode.left = new Node(2);
        treeRootNode.left.left = new Node(4);
        treeRootNode.left.right = new Node(5);

        // right part
        treeRootNode.right = new Node(3);
        treeRootNode.right.right = new Node(6);

        // second tree
        Node subtreeNode = new Node(2);

        //left
        subtreeNode.left = new Node(4);
        //right
        subtreeNode.right = new Node(5);

        System.out.println(isSubtree(treeRootNode, subtreeNode));
    }
}

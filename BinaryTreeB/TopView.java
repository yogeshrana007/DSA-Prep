
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Info {

    Node node;
    int hd; // horizontal distance

    public Info(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class TopView {

    public static void topView(Node root) {

        Info info = new Info(root, 0);
        // level Order
        Queue<Info> q = new LinkedList<>();

        HashMap<Integer, Node> map = new HashMap<>();

        q.add(info);
        q.add(null);

        int min = 0, max = 0;

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr == null) {

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }

                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String args[]) {

        Node root = new Node(1);
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
        topView(root);
    }
}

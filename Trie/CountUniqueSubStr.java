package Trie;

public class CountUniqueSubStr {

    static class Node {

        Node[] children = new Node[26];
        boolean eow = false; // end of word

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // insert in trie
    public static void insert(String str) {

        Node curr = root;

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {

                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {

        String str = "ababa";

        for (int i = 0; i < str.length(); i++) {
            insert(str.substring(i));
        }

        System.err.println(countNodes(root));

    }
}

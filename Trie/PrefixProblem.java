package Trie;

public class PrefixProblem {

    static class Node {

        Node[] children = new Node[26];
        boolean eow = false; // end of word
        int freq; // frq to track unique node 

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
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
            } else {
                curr.children[idx].freq++;
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

    public static void findPrefix(Node root, String ans) {
        if (root == null) {
            return;
        }
        if (root.freq == 1) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }

    }

    public static void main(String[] args) {

        String[] words = {"look", "like", "drive", "dove", "mobile", "mobility"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        root.freq = -1;
        findPrefix(root, "");
    }
}

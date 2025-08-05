
public class Implement {

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

    public static void main(String args[]) {

        String[] words = {"the", "there", "their", "a", "any"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.err.println(search("th"));
    }
}


import java.util.HashMap;
import java.util.Scanner;

public class AnagramPrblm {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        /*First Way */

 /*
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            }
        }
         */
        // Second way--->
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            Integer count = map.get(c);

            if (count == null) {
                return false;
            }

            if (count == 1) {
                map.remove(c);
            } else {
                map.put(c, count - 1);
            }
        }

        return map.isEmpty();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String s = sc.nextLine();

        System.out.print("Enter second string : ");
        String t = sc.nextLine();

        if (isAnagram(s, t)) {
            System.out.println("Yes Anagram!");
        } else {
            System.out.println("Not anagram!!");
        }

    }
}

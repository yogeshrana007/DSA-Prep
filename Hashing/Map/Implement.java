
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Implement {

    public static void main(String args[]) {

        /* 1. hashmap */
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("USA", 100);
        hm.put("UK", 80);
        System.out.println("HashMap -> " + hm);

        /* 2. Linked HashMap --> Order of insertion is maintained*/
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("USA", 100);
        lhm.put("UK", 80);
        System.out.println("Linked HashMap -> " + lhm);

        /*3. TreeMap -> Sorted on the basis of key */
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 150);
        tm.put("USA", 100);
        tm.put("UK", 80);
        System.out.println("TreeMap -> " + tm);

        /* more operations :- get(key), containsKey(key), remove(key), size(), isEmpty(), clear()  */
        // Iterate on Map-
        for (String key : hm.keySet()) {
            System.out.println("key : " + key + ", value : " + hm.get(key));
        }

        // We can perform all these operation in all three types of map and iterate them as above using keySet()
    }
}

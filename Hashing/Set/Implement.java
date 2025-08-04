
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Implement {

    public static void main(String args[]) {

        // randomly ordered
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(8);
        hs.add(0);
        hs.add(3);
        hs.add(31);
        hs.add(32);
        hs.add(45);
        hs.add(2);
        System.out.println(hs);

        // maintain the order of insertion
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(1);
        lhs.add(3);
        System.out.println(lhs);

        // sorted in ascending order
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(1);
        ts.add(2);
        System.out.println(ts);

        // there are many operations like:- contains(key), remove(key), size(), clear()
        // Iteration on set
        // two ways
        //1.
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // 2nd
        for (Integer s : hs) {
            System.out.print(s + " ");
        }
    }
}

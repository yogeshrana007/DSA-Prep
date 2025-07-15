
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivityProblem {

    /* Case: 1 where activity is given sorted on the basis of end */
    public static void firstCase() {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(0); // Adding first activity because it will finishes first
        int lastEnd = end[0];

        int maxActivity = 1;  // 1 because we have added first activity

        for (int i = 1; i < start.length; i++) {

            if (start[i] >= lastEnd) {
                maxActivity++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum activity can be done : " + maxActivity);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }

    }


    /* Case: 2 where activity not given sorted  */
    public static void secondCase() {

        int[] start = {0, 1, 3, 5, 5, 8};
        int[] end = {6, 2, 4, 9, 6, 9};

        int[][] activity = new int[start.length][3];
        // here we use 3 cols b'coz we have to store index so we can tell which activity is choosen

        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        // sorting activity on the basis of index 2 means end time
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(activity[0][0]); // Idx at which after sorting 

        int lastEnd = activity[0][2];

        int maxActivity = 1; // initially one b'coz we already choose the activity which finishes first

        for (int i = 1; i < start.length; i++) {

            if (activity[i][1] >= lastEnd) {
                maxActivity++;
                ans.add(activity[i][0]);
                lastEnd = activity[i][2];
            }
        }
        System.out.println("Maximum activity can be done : " + maxActivity);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }

    }

    public static void main(String args[]) {

        // firstCase();
        secondCase();
    }
}

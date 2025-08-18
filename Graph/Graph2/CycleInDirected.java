
import java.util.ArrayList;

public class CycleInDirected {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // vertex-0
        // vertex-1
        graph[1].add(new Edge(1, 0, 1));

        // vertex-2
        graph[2].add(new Edge(2, 0, 1));

        // vertex-3
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 2, 1));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i] && isCycleUtil(graph, i, vis, stack)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] stack) {
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // case 1 (where neighbour still not visited)
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            } // case 2 (where neighbour is already visited and in stack array)
            else if (stack[e.dest]) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String args[]) {

        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        /*     Graph structure :- 
         * 
         * 
         *     (1) ----> (0) <---- (2)
         *                ^        ^
         *                 \      /
         *                  \    /
         *                    (3)
         */
        System.out.println(isCycle(graph));
    }
}

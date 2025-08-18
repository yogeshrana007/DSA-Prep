
import java.util.ArrayList;

public class CycleInUndirected {

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
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // vertex-1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // vertex-2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // vertex-3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // vertex-4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // vertex-5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // vertex-6
        graph[6].add(new Edge(6, 5, 1));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {

        boolean[] visit = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                if (isCycleUtil(graph, i, -1, visit)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, int par, boolean[] visit) {

        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // case : 1 (where neighbour still not visited)
            if (!visit[e.dest]) {
                if (isCycleUtil(graph, e.dest, curr, visit)) {
                    return true;
                }
            } // case : 2 (where neighbour is visited & not par)
            else if (visit[e.dest] && e.dest != par) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        /*     Graph structure :-
         *
         *          (1) ----- (3)
         *         /          |   \
         *        /           |    \
         *     (0)            |     (5) ----- (6)
         *        \           |    /
         *         \          |   /
         *          (2) ----- (4)
         */
        System.out.println(isCycle(graph));
    }
}

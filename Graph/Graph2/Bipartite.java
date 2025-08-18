
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {

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
        graph[3].add(new Edge(3, 5, 1));

        // vertex-4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));

        // vertex-5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // vertex-6
        graph[6].add(new Edge(6, 5, 1));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {

        int[] color = new int[graph.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0;

                while (!q.isEmpty()) {
                    int curr = q.remove();

                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);

                        // case : 1 where neighbour has no color
                        if (color[e.dest] == -1) {
                            int nextCol = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextCol;
                            q.add(e.dest);
                        } // case 2 where neighbour and curr both have same color
                        else if (color[e.dest] == color[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {

        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        /*     Graph structure :- 
         *     For:
         *     1. Acyclic :- always true
         *     2. Even cycle :- true {even node}
         *     3. Odd cycle : false
         * 
         *          (1) ----- (3)
         *         /              \
         *        /                \
         *     (0)                  (5) ----- (6)
         *        \                /
         *         \              /
         *          (2) ----- (4)
         */
        System.out.println(isBipartite(graph));
    }
}

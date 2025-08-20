import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra{

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // vertex-0
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // vertex-1
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        // vertex-2
        graph[2].add(new Edge(2, 4, 3));

        // vertex-3
        graph[3].add(new Edge(3, 5, 1));

        // vertex-4
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        // vertex-5
        

    }

    static class Pair implements Comparable<Pair>{
        int v;
        int path;

        public Pair(int v, int path){
            this.v = v;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src){
        int[] dist = new int[graph.length];
        for(int i = 0; i < dist.length; i++){
            if( i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;

                // neighbour
                for(int i = 0; i < graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    int u = e.src; // or curr.v both are same
                    int v = e.dest;
                    int wt = e.wt; // edge wt

                    if(dist[u]+wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // printing values
        for(int i = 0; i < dist.length; i++){
            System.out.println("index "+i+" -> "+dist[i]);
        }
    }
    
    public static void main(String args[]){
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        /**     Graph:- Structure
         *       2            7           1
         *     ------> (1)  -----> (3) ------|
         *    |         |           ^        V
         *   (0)        | 1         | 2     (5)
         *    |         V           |        ^
         *    -------> (2)  -----> (4) ------|
         *      4             3           5
        */
        dijkstra(graph, 0);
    }
}



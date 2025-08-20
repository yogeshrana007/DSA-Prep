// Prim's Algo is used to find MST(Minimum Spanning Tree) or minimim weight tree means from src reach to all other nodes with minimum cost

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims{
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
        int cost;
        int parent;

        public Pair(int v, int cost, int par){
            this.v = v;
            this.cost = cost;
            this.parent = par;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge>[] graph){

        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0, -1));

        ArrayList<Edge> list = new ArrayList<>();

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!vis[curr.v]){
                vis[curr.v] = true;

                if(curr.parent != -1){
                    list.add(new Edge(curr.parent, curr.v, curr.cost));
                }

                // neighbour
                for(int i = 0; i < graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt, e.src));
                    }
                    
                }
            }
        }
        // printing edges
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i).src+" -> "+ list.get(i).dest +" wt "+list.get(i).wt);
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
        prims(graph);
    }
}
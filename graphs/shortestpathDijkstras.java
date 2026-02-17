package graphs;


import java.util.*;

public class shortestpathDijkstras {

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

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i ++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 0, 4));
        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 1, 7));
        graph[3].add(new Edge(3, 4, 2));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 3));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 5));
        graph[5].add(new Edge(5, 6, 6));

        // Strong cycle connection
        graph[6].add(new Edge(6, 0, 8));
    }

    // public static void bfs(ArrayList<Edge> graph[], int V, boolean[] vis, int start){
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(start);
    //     while(!q.isEmpty()){
    //         int curr = q.remove();
    //         if(vis[curr] == false){
    //             System.out.println(curr);
    //             vis[curr] = true;
    //             for(int i = 0; i < graph[curr].size(); i ++){
    //                 Edge e = graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
    // }


    static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int n, int d){
            this.node = n;
            this.dist = d;
        }
        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;
        }
    }

    public static void dijstras(ArrayList<Edge> graph[], int src, int V){
    PriorityQueue<Pair> pq = new PriorityQueue<>();

    int dis[] = new int[V];
    for(int i = 0; i < V; i++){
        dis[i] = Integer.MAX_VALUE;
    }
    dis[src] = 0;   // IMPORTANT

    boolean[] vis = new boolean[V];

    pq.add(new Pair(src, 0));   // FIXED

    while(!pq.isEmpty()){
        Pair curr = pq.remove();

        if(!vis[curr.node]){
            vis[curr.node] = true;

            for(int i = 0; i < graph[curr.node].size(); i++){
                Edge e = graph[curr.node].get(i);

                int u = e.src;
                int v = e.dest;

                if(dis[u] != Integer.MAX_VALUE && dis[u] + e.wt < dis[v]){
                    dis[v] = dis[u] + e.wt;
                    pq.add(new Pair(v, dis[v]));   // FIXED
                }
            }
        }
    }

    for(int i = 0; i < V; i++){
        System.out.print(dis[i] + " ");
    }
    System.out.println();
}
    public static void main(String args[]) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        CreateGraph(graph);
        dijstras(graph, 0, V);
    }
} 
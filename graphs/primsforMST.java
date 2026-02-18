package graphs;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class primsforMST {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i ++) graph[i] = new ArrayList<>();
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
        graph[4].add(new Edge(4, 5, -10)); // 🔥 negative edge

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 5));
        graph[5].add(new Edge(5, 6, 6));

        graph[6].add(new Edge(6, 0, 8));
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int n, int c){
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost; //ascending order
        }
    }

    public static void primsAlgo(ArrayList<Edge> graph[], int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>(); //mst-set
        boolean[] vis = new boolean[V]; //mst-set
        pq.add(new Pair(0, 0));
        int finalCost = 0;
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(vis[curr.node] == false){
                vis[curr.node] = true;
                finalCost += curr.cost;

                for(int i = 0; i < graph[curr.node].size(); i ++){
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println("minimum cost :" + finalCost);
    }
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        primsAlgo(graph, V);
    }
}

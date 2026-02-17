package graphs;
import java.util.ArrayList;

public class cycledetection {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[], boolean vis[], int curr, int par){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i ++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == true && par == e.dest) return true;
            if(!vis[e.dest]){
                if(isCycle(graph, vis, e.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void CreateGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i ++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        // 🔥 Added to make strong cycle
        graph[6].add(new Edge(6, 0));   // closes big cycle self point to itself
    }

    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        System.out.println(isCycle(graph, new boolean[V], 0, -1));
    }
}

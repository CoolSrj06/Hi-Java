import java.util.ArrayList;

public class Graph_hasPath {
        public static class Edge {
            int scr, dest, cost;

            Edge(int src, int dest, int cost) {
                this.scr = src;
                this.dest = dest;
                this.cost = cost;
            }
        }
    public static void main(String[] args) {
            ArrayList<Edge>[] graph=new ArrayList[7];
            construct(graph);
        System.out.println(hasPath(graph,0,new boolean[graph.length],7));
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int curr, boolean[] vis,int dest){
        if (curr==dest)
            return true;
        vis[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if (!vis[e.dest]&&hasPath(graph,e.dest,vis,dest)){
                return true;
            }
        }
        return false;
    }
    public static void construct(ArrayList<Edge>[] graph){

        /*
             1----3
            /     | \
           0      |  5--6
            \     | /
             2----4
         */

        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }

        //Node 0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        //Node 1
        graph[1].add(new Edge(1,3,1));
        graph[1].add(new Edge(1,0,1));
        //Node 2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        //Node 3
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));
        graph[3].add(new Edge(3,1,1));
        //Node 4
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));
        graph[4].add(new Edge(4,2,1));
        //Node 5
        graph[5].add(new Edge(5,6,1));
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        //Node 6
        graph[6].add(new Edge(6,5,1));

    }
}

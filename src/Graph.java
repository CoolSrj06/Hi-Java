import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public static class Edge{
        int scr,dest,cost;
        Edge(int src,int dest,int cost){
            this.scr=src;
            this.dest=dest;
            this.cost=cost;
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[7];
        construct(graph);
        dfs(graph,1,new boolean[graph.length]);

    /*
           2
        0-----1
            / \
          5/   \ 1
          /  3  \
         5-------2
         |
       -1|
         |
         1
     */
     /*

        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v]; // this is null at this time --> Now making it an empty array list

        for (int i = 0; i < v; i++) {
            graph[i]=new ArrayList<>();
        }
        // 1st node
        graph[0].add(new Edge(0,1,2));
        // 2nd node
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,5,5));
        graph[1].add(new Edge(1,0,2));
        //3rd node
        graph[2].add(new Edge(2,5,3));
        graph[2].add(new Edge(2,1,1));
        //4th node
        graph[3].add(new Edge(5,1,-1));
        graph[3].add(new Edge(5,2,3));
        //5th node
        graph[4].add(new Edge(1,5,-1));

        //2nd node neighbour
        for (int i = 0; i < graph[1].size(); i++) {
            Edge e=graph[1].get(i);
            System.out.println(e.dest);
        }
    }

      */

    }

    /*
    //Time Complexity: O(V+E)
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] vis=new boolean[graph.length+1];

        while (!q.isEmpty()){
            int curr=q.remove();
            if (!vis[curr]){//visit node
                //Step 1: visit the node
                System.out.print(curr+" ");
                //Step 2: in vis array change the current position to true
                vis[curr]=true;
                //Step 3:
                for (int i = 0; i < graph[curr].size(); i++) {//0 to the length of list that has a position of at curr index. basically to get the connected nodes of correct index
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

     */

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]){
        System.out.print(curr + " ");
        vis[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
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
        graph[0].add(new Graph.Edge(0,1,1));
        graph[0].add(new Graph.Edge(0,2,1));
        //Node 1
        graph[1].add(new Graph.Edge(1,3,1));
        graph[1].add(new Graph.Edge(1,0,1));
        //Node 2
        graph[2].add(new Graph.Edge(2,0,1));
        graph[2].add(new Graph.Edge(2,4,1));
        //Node 3
        graph[3].add(new Graph.Edge(3,4,1));
        graph[3].add(new Graph.Edge(3,5,1));
        graph[3].add(new Graph.Edge(3,1,1));
        //Node 4
        graph[4].add(new Graph.Edge(4,3,1));
        graph[4].add(new Graph.Edge(4,5,1));
        graph[4].add(new Graph.Edge(4,2,1));
        //Node 5
        graph[5].add(new Graph.Edge(5,6,1));
        graph[5].add(new Graph.Edge(5,3,1));
        graph[5].add(new Graph.Edge(5,4,1));
        //Node 6
        graph[6].add(new Graph.Edge(6,5,1));

//        for (int i = 0; i < graph[0].size(); i++) {
//            Edge e=graph[0].get(i);
//            System.out.println(e.dest);
//        }
    }
}

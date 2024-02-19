import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_of_graph {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> traversal = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int size = adj.size();
        boolean[] visited = new boolean[size];
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int pop = queue.poll();
            traversal.add(pop);// added to answer list
            for(int i = 0 ; i < adj.get(pop).size() ; i++){ // loop for the particular row
                int current = adj.get(pop).get(i);
                if(!traversal.contains(current) && visited[current] != true){
                    queue.add(current);
                    visited[current] = true;
                }
            }
        }
        return traversal;
    }
}

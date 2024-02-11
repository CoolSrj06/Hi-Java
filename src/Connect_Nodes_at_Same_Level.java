import java.util.LinkedList;
import java.util.Queue;

public class Connect_Nodes_at_Same_Level {

    public void connect(Node root) {
        Queue<Integer> queue=new LinkedList<>();
        if(root==null)
            return;
        queue.add(root.data);
        connect(root.left);
        connect(root.right);
    }
}

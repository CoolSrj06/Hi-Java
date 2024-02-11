public class Nth_node_from_end_of_LinkedList {
    public static void main(String[] args) {
        Node node=null;
        for (int i=1;i<=1;i++){
            node=insert(node,i);
        }
        System.out.println(getNthFromLast(node,1));
    }
    static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    private static Node insert(Node head, int n){
        if(head==null) {
            // If the linked list is empty, create a new node
            head=new Node(n);
        }
        else {
            // If the linked list is not empty, recursively insert into the next node
            head.next=insert(head.next,n);
        }
        return head;
    }
    public static int getNthFromLast(Node head, int n)
    {
        // Your code here
        if (head==null)
            return -1;
        int l=1;
        Node temp=head;
        while (temp.next!=null) {
            l++;
            temp=temp.next;
        }
        if (l-n<0)
            return -1;
        int ans;
        temp=head;
        for (int i = 0; i < l-n; i++) {
            temp= temp.next;
        }
        return temp.data;
    }
}

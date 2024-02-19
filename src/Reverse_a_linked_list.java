import java.util.LinkedList;
import java.util.Stack;

public class Reverse_a_linked_list {
    private static class Node {
        int data;
        Node next;
        Node(int value) {
            this.data = value;
        }
    }
    public static void main(String[] args) {
        Node head=null; // assume the head point to a null node
        Node temp=head; // new after declaring temp, temp to points to the same null node
        // if any change in the node via temp it is reflected back in head.
        for (int i = 0; i < 5; i++) {
            if (head == null) {
                head = new Node(i);
                temp = head;
            } else {
                temp.next = new Node(i);
                temp = temp.next;
            }
        }
        Node ans =reverseList(head);
        while (ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
    public static Node reverseList(Node head)
    {
        // code here
        Node temp=head;
        Stack<Integer> st=new Stack<>();
        while (temp!=null){
            st.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (!st.isEmpty()){
            temp.data=st.pop();
            temp=temp.next;
        }
        return head;
    }
}

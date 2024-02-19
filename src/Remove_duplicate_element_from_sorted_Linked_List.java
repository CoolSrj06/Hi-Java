public class Remove_duplicate_element_from_sorted_Linked_List {
    public static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public static void main(String[] args) {
        Node head=null;
        Node temp=head;
        for (int i = 0; i < 5; i++) {
            if(head==null){
                head=new Node(i);
                temp=head;
            }else {
                temp.next=new Node(i);
                temp=temp.next;
            }
        }
        temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        head=removeDuplicates(head);
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static Node removeDuplicates(Node head)
    {
        // Your code here
        Node temp=head;
        while (temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return head;
    }
}

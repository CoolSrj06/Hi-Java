import java.util.ArrayList;

public class BST {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    //Data member
    public Node root;
    //constructor for the BST
    public BST(){
        root=null;
    }
    public static Node insert(Node root,int n){
        Node node=new Node(n);
        if(root==null) {
            return node;
        } else if (root.data>node.data) {
            root.left=insert(root.left,n);
        }else {
            root.right=insert(root.right,n);
        }
        return root;
    }
    public static void display(Node root){
        if(root==null)
            return;
        display(root.left);
        System.out.print(root.data+" ");
        display(root.right);
    }

    public static boolean checkBST(Node root){
//        Below code for checking if it is a valid BST but fails at some test cases
//        return checkBSTHelper(root,Integer.MAX_VALUE,Integer.MIN_VALUE);

//        Below code for checking BST using the concept of Inorder Traversal
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i)>= ans.get(i+1))
                return false;
        }
        return true;
    }
//    private static boolean checkBSTHelper(Node root,int max,int min) {
//        if (root == null)
//            return true;
//        if ((root.data > max)||(root.data<min)){
//            return false;
//        }
//        return checkBSTHelper(root.left,root.data,min)&&checkBSTHelper(root.right,max,root.data);
//    }

    public static ArrayList<Integer> ans=new ArrayList<>();
    public static void InorderTrav(Node root){
        if(root==null){
            return;
        }
        InorderTrav(root.left);
        ans.add(root.data);
        InorderTrav(root.right);
    }

    public static void main(String[] args) {
        Node root=null;
        root=insert(root,1);
        root=insert(root,1);
        root=insert(root,7);
        display(root);
        System.out.println();
        InorderTrav(root);
        System.out.println(ans);
        System.out.println(checkBST(root));
    }
}

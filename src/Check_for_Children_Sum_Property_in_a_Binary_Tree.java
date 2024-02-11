//
//public class Check_for_Children_Sum_Property_in_a_Binary_Tree {
//    public static int isSumProperty(Node root)
//    {
//        if (root==null)
//            return 1;
//        if (root.right==null&&root.left==null)
//            return 1;
//        int sum=0;
//        if(root.left!=null)
//            sum+=root.left.data;
//        if (root.right!=null)
//            sum=root.right.data;
//        if(root.data==sum){
//            return isSumProperty(root.left) & isSumProperty(root.right);;
//        }
//        return 0;
//    }
//}
//

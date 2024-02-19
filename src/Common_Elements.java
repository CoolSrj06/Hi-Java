import java.util.ArrayList;

public class Common_Elements {
    public static void main(String[] args) {
        int[] A={1,5,10,20,40,80};
        int[] B={6,7,20,80,100};
        int[] C={3,4,15,20,30,70,80,120};
        System.out.println(commonElements(A,B,C, A.length, B.length,C.length));
    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
//    {
//        //1st code here
//        ArrayList<Integer> ans=new ArrayList<>();
//        ArrayList<Integer> a=new ArrayList<>();
//        for (int val:A){
//            a.add(val);
//        }
//        ArrayList<Integer> b=new ArrayList<>();
//        for (int val:B){
//            b.add(val);
//        }
//        ArrayList<Integer> c=new ArrayList<>();
//        for (int val:C){
//            c.add(val);
//        }
//        for (int val:a){
//            if (b.contains(val)&&c.contains(val))
//                if(!ans.contains(val))
//                    ans.add(val);
//        }
//        return ans;
//    }
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int i,j,k;
        i=j=k=0;
        while (i<n1&&j<n2&&k<n3){
            if (A[i]==B[j]&&B[j]==C[k]){
                if (ans.contains(A[i])){
                    i++;j++;k++;
                }
                else {
                    ans.add(A[i]);
                }
            } else if (A[i]<B[j]) {
                i++;
            } else if (B[j]<C[k]) {
                j++;
            } else
                k++;
        }
        return ans;
    }
}

import java.util.ArrayList;

public class Sorted_subsequence_of_size_3 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(find3Numbers(a,5));
    }
    static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr.get(0));
        int min=arr.get(0);
        for (int i = 1; i < n; i++) {
            if (arr.get(i)>min) {
                list.add(arr.get(i));
                min = arr.get(i);
            }
        }

        if(list.size()<3)
            return new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int comb=factorial(list.size()) / factorial(3)*factorial(list.size()-3);
        ans.add(comb);
        return ans;
    }

    static int factorial(int n){
        if(n==0)
            return 1;
        if(n==1)
            return 1;

        return n*factorial(n-1);
    }
}

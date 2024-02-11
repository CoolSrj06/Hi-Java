import java.util.ArrayList;
import java.util.Arrays;

public class Leaders_in_an_array {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        System.out.println(leaders(arr,6));
    }

    /* This code below take n^2 complexity
//    static ArrayList<Integer> leaders(int arr[], int n){
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int i = 0; i < n-1; i++) {
//            int max=arr[i];
//            int check=arr[i];
//            for (int j = i; j < n; j++) {
//                if (check<arr[j])
//                    check=arr[j];
//            }
//            if (check==max)
//                list.add(max);
//        }
//        list.add(arr[n-1]);
//        return list;
//    }

     */

    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[n-1]);
        for (int i = n-2; i >= 0; i--) {
            if (arr[i]>=list.getLast())// >= for taking equal numbers in the list
                list.add(arr[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = list.size()-1; i >= 0 ; i--) {
            ans.add(list.get(i));
        }
        return ans;
    }
}

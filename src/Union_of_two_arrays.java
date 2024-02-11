import java.util.HashMap;
import java.util.HashSet;

public class Union_of_two_arrays {
    public static void main(String[] args) {
        //HashSet store set of unique values
        HashSet<Integer> set=new HashSet<>();
        int[] arr1={1,2,3,4,5};
        int[] arr2={3,4,6,7,8};
        for (int val : arr1) {
            set.add(val);
        }
        for (int val:arr2){
            set.add(val);
        }
        System.out.println(set.size());
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class Count_pairs_with_given_sum {
    public static void main(String[] args) {
        int [] arr={1,5,7,1};
        System.out.println(getPairsCount(arr,4,6));
    }
    static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for (int val:arr) {
            int b=k-val;
            if (map.containsKey(b))
                c+=map.get(b);
            if (map.containsKey(val))
                map.put(val, map.get(val)+1);
            else
                map.put(val,1);
        }
        return c;
    }
}

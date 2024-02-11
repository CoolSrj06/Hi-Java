import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Subarray_sum_equal_to_K {
    public static void main(String[] args) {
        int[] arr = {10,-2,2,-20,10};
        System.out.println(subarray(arr, -10));
    }

    public static int subarray(int[] arr, int k) {
//        HashSet<Integer> sum = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (sum.isEmpty())
//                sum.add(arr[0]);
//            else
//                sum.add(arr[i - 1] + arr[i]);
//        }
//        System.out.println(sum);
//        for(int val:sum){
//            if ()
//        }

        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();// sum,frequency
        hm.put(0,1);//frequency for empty subarray
        int ans=0;
        for (int val:arr){
            sum+=val;
            if (hm.containsKey(sum-k)){
                ans=hm.get(sum-k)+1;
            }
            if (hm.containsKey(sum)){
                hm.put(sum,hm.get(sum)+1);
            }
            else {
                hm.put(sum,1);
            }
        }
        return ans;
    }
}


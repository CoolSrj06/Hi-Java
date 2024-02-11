import java.util.*;

public class Find_all_pair_with_a_given_sum {

    static class pair  {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        long[] A={1,4,2,5,7};
        long[] B={5,6,3,4,8};
        long X=8;
        System.out.println(Arrays.toString(allPairs2(A, B, 5, 5, 9)));
    }
    public static void allPairs(long A[], long B[], long N, long M, long X) {
        // Your code goes here
        TreeMap<Long,Long> b=new TreeMap<>();
        TreeMap<Long,Long> a=new TreeMap<>();
        for (long val:B){
            b.put(val, b.getOrDefault(val,0L));
        }
        for (long val:A){
            a.put(val, a.getOrDefault(val,0L));
        }
        Set<Long> set=b.keySet();
        for (long val:a.keySet()){
            if (set.contains(X-val))
                System.out.println(val+" "+(X-val));
        }
    }

    static pair[] allPairs2(long A[], long B[], long N, long M, long X) {
        // Your code goes here
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<pair> pairs=new ArrayList<>();
        HashSet<Long> b=new HashSet<>();
        for (long val:B){
            b.add(val);
        }
        for (long val:A){
            if (b.contains(X-val))
                pairs.add(new pair(val,X-val));
        }
        pair[] arr=new pair[pairs.size()];
        pairs.toArray(arr);
        return arr;
    }

}

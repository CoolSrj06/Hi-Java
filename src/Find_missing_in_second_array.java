import java.util.ArrayList;
import java.util.HashSet;

public class Find_missing_in_second_array {
    public static void main(String[] args) {
        long[] A={227 ,2 ,17 ,15 ,17 ,21 ,26 ,30 ,16 ,12 ,19 ,22 ,18 ,8 ,24 ,10 ,17 ,28 ,14 ,7 ,4 ,21,3,4};
        long[] B={25, 12, 30, 24, 14, 34};
        System.out.println(findMissing(A,B,24,6));
    }
    public static ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        ArrayList<Long> ans=new ArrayList<>();
        HashSet<Long> b=new HashSet<>();
        for (long val:B){
            b.add(val);
        }
        for (long val:A){
            if(!b.contains(val))
                ans.add(val);
        }
        return ans;
    }
}

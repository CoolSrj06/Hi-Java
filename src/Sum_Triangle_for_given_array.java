import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_Triangle_for_given_array {
    public static void main(String[] args) {
        long arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(getTriangle(arr,arr.length)));
    }
    public static long[] getTriangle(long arr[], long n) {
        List<Long> ans=new ArrayList<>();
        helper(arr,n,ans);

        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }

        long[] answer =new long[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i]=ans.get(i);
        }
        return answer;
    }
    public static void helper(long arr[], long n, List<Long> ans){
        if (n==0)
            return;
        long[] newArr=new long[(int)n-1];
        for (int i = 0; i < n-1; i++) {
            newArr[i]=arr[i]+arr[i+1];
        }
        helper(newArr,n-1,ans);

        for (int i = 0; i < newArr.length; i++) {
            ans.add(newArr[i]);
        }
    }
}

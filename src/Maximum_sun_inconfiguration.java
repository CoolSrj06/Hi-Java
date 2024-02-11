import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Maximum_sun_inconfiguration {
    public static void main(String[] args) {
        int[] arr={8,3,1,2};
        System.out.println(max_sum(arr, arr.length));
    }
    static int max_sum(int A[], int n)
    {
        // Your code here
        int sum=0;
        int r0=0;
        for (int i=0;i<n;i++) {
            sum += A[i];
            r0+=A[i]*i;
        }
        int[] arr=new int[n];
        arr[0]=r0;
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]-sum+n*A[i-1];
        }
        Arrays.sort(arr);
        return arr[n-1];
    }
}

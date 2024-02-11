import java.util.Arrays;

public class Find_minimum_and_maximum_element_in_an_array {
    public static void main(String[] args) {
        long[] a={2,5,6,7,8,1,26,4};
        System.out.println("[min,max] : "+Arrays.toString(getMinMax(a, a.length)));
    }
    public static long[] getMinMax(long a[], long n)
    {
        long[]ans={a[0],a[0]};
        helper(a,n,0,ans);
        return ans;
    }
    public static void helper(long[] a,long n,int i,long [] ans){
        if(i==n)
            return ;
        if(ans[0]>a[i]){
            ans[0]=a[i];
        }
        if(ans[1]<a[i]){
            ans[1]=a[i];
        }
        helper(a,n,i+1,ans);
    }
}

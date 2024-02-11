public class Equilibrium_Point {
    public static void main(String[] args) {
        long[] arr={1,3,5,2,2};
        System.out.println(equilibriumPoint(arr,5));
    }
    public static int equilibriumPoint(long arr[], int n) {
        int start=0;
        int end=n-1;
        long left_sum=0;
        long right_sum=0;
        while (start<end) {
            if (left_sum == right_sum) {
                left_sum += arr[start];
                right_sum += arr[end];
                start++;
                end--;
            }
            if (left_sum < right_sum) {
                left_sum += arr[start];
                start++;
            } else {
                right_sum += arr[end];
                end--;
            }
        }
        if (left_sum == right_sum){
            return start+1;
        }else {
            return -1;
        }
    }
}

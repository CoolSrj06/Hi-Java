public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        System.out.println(binarysearch(arr,5,4));
        System.out.println(helper(arr,0,arr.length-1,6,-1));
    }
    public static int binarysearch(int arr[], int n, int k) {
        int start=0;
        int end=n-1;
        while (start<=end){
            int mid=start-(start-end)/2;
            if (k==arr[mid])
                return mid;
            else if (k<arr[mid]) {
                end=mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int helper(int arr[],int start,int end,int k,int ans){
        if(start>end){
            return -1;
        }
        int mid=start-(start-end)/2;
        if (k==arr[mid])
            ans=mid;
        else if (k<arr[mid]) {
            return helper(arr,start,mid-1,k,ans);
        }
        else {
            return helper(arr,mid+1,end,k,ans);
        }
        return ans;
    }
}

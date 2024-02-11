public class Second_Largest {
    public static void main(String[] args) {
        int []arr={10,5,10};
        System.out.println(print2largest(arr,3));
    }
    public static int largest(int []arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int print2largest(int[] arr,int n) {
        int max=largest(arr);
        int secMax=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>secMax&&arr[i]!=max)
                secMax=arr[i];
        }
        if (secMax==Integer.MIN_VALUE)
            return -1;
        return secMax;
    }
}

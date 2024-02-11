import java.util.Arrays;
import java.util.HashSet;

public class Find_Missing_And_Repeating {
    public static void main(String[] args) {
        int[] arr={13 ,33 ,43 ,16 ,25 ,19 ,23 ,31 ,29 ,35 ,10 ,2 ,32 ,11 ,47 ,15 ,34 ,46 ,30 ,26 ,41 ,18 ,5 ,17 ,37 ,39 ,6 ,4 ,20 ,27 ,9 ,3 ,8 ,40 ,24 ,44 ,14 ,36 ,7 ,38 ,12, 1, 42, 12, 28, 22, 45};
        int[] arr1={12 ,7 ,5 ,1 ,13 ,1 ,10 ,8 ,11 ,9 ,2 ,4, 3, 6};
        int[] arr2={1,3,3};
         System.out.println(Arrays.toString(findTwoElement(arr1,arr1.length)));
    }
    static int[] findTwoElement(int arr[], int n) {
        // code here
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int r=0;//repeater
        int m=0;//missing
        HashSet<Integer> set=new HashSet<>();
        for(int val=0;val<arr.length;val++){
            set.add(arr[val]);
            if (!set.contains(val+1))
                m=val+1;
        }
        if (m==0)
            m=arr.length;
        for (int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                r=arr[i];
            }
        }
        return new int[]{r,m};
    }
}

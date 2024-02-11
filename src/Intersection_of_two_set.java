import java.util.HashSet;

public class Intersection_of_two_set {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={5,6,7,8,9};
        HashSet<Integer> set=new HashSet<>();
        for (int val:arr1){
            set.add(val);
        }
        int c=0;
        for (int val:arr2) {
            if (set.contains(val))
                c++;
        }
        System.out.println(c);
    }

}

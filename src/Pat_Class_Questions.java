import java.util.ArrayList;
import java.util.Scanner;

public class Pat_Class_Questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a word");
//        String s= sc.nextLine();
//        System.out.println(palin(s));

//        int arr[]={21,5,8,7,23,6,10};
//        int max;
//        int min;
//        min=max=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>max)
//                max=arr[i];
//            if (arr[i]<min)
//                min=arr[i];
//        }
//        System.out.println("(Max,Min) = ("+max+","+min+")");

        /* calling isPrime function */
        sementedSeive(10,100);

    }


    /* Day3 function to check if a given string is a palindrome.*/
//    public static boolean palin(String str) {
//        String w="";
//        for (int i = 0; i < str.length(); i++) {
//            w=str.charAt(i)+w;
//        }
//        if (w.equals(str))
//            return true;
//        else
//            return false;
//    }

    /*
    * Day 5: Find all the prime numbers using simple seive algorithm
    * Time Complexity: n(log(log n))
    * Space Complexity: O(N)
    */

    public static ArrayList<Integer> isPrime(int n){
        boolean[] arr=new boolean[n+1];
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=2;i<=Math.sqrt(n);i++){
            int c=i*i;
            if(!arr[i]){
                while (c<=n){
                    arr[c]=true;
                    c=c+i;
                }
            }
        }
        for (int i=2;i<n+1;i++){
            if (!arr[i])
                ans.add(i);
        }
        return ans;
    }

    /* Day 6: Find all the prime numbers withing a range using segmented seive algorithm

     */

    public static void sementedSeive(int start,int end){
        ArrayList<Integer> prime=isPrime((int)Math.sqrt(end));
        boolean[] arr=new boolean[end-start+1];
        for (int i = 0; i < prime.size(); i++) {
            int c=1;
            while (prime.get(i)*c<=end){
                if (prime.get(i)*c>=start){
                    arr[(prime.get(i)*c)-start]=true;
                    c++;
                }
                else
                        c++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i])
                System.out.println(i+start);
        }
    }
}

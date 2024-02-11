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
        isPrime(25);

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

    public static void isPrime(int n){
        boolean[] arr=new boolean[n+1];
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
                System.out.print(i+" ");
        }
    }

}

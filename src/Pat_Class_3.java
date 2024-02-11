import java.util.Scanner;

public class Pat_Class_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a word");
//        String s= sc.nextLine();
//        System.out.println(palin(s));

        int arr[]={21,5,8,7,23,6,10};
        int max;
        int min;
        min=max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max=arr[i];
            if (arr[i]<min)
                min=arr[i];
        }
        System.out.println("(Max,Min) = ("+max+","+min+")");

    }

    //function to check if a given string is a palindrome.
    public static boolean palin(String str) {
        String w="";
        for (int i = 0; i < str.length(); i++) {
            w=str.charAt(i)+w;
        }
        if (w.equals(str))
            return true;
        else
            return false;
    }


}

import java.util.Scanner;

public class Special_Fibonacci {
    public static int nthFibonacci(int a,int b, int n){
        if(n==0){
            return a;
        }
        if (n==1){
            return b;
        }
        return nthFibonacci(a,b,n-1)^nthFibonacci(a,b,n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            System.out.println("Enter the value of a");
            int a = sc.nextInt();
            System.out.println("Enter the value of b");
            int b = sc.nextInt();
            System.out.println(nthFibonacci(a,b,n));
        }
    }
}


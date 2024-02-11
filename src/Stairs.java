import java.util.ArrayList;
/*Using the concept of Fibonacci here*/


public class Stairs {
    public static void main(String[] args) {
        int n=4;
        System.out.println("Number of ways: "+nthFibonacci(n+1,0,1,1));
    }
    public static int nthFibonacci(int n,int a,int b,int c){
        if(n==0){
            return a;
        }
        a=b;
        b=c;
        c=a+b;
        return nthFibonacci(n-1,a,b,c);
    }
//    public static int nthFibo(int n){
//        ArrayList<Integer> list=new ArrayList<>();
//        int mod=1000000007;
//
//        list.add(0);
//        list.add(1);
//        if(n==1)
//            return 1;
//        else {
//            for (int i = 2; i <=n ; i++) {
//                list.add((list.get(n-1)+ list.get(n-2))%mod);
//            }
//        }
//        return list.get(n);
//    }
}

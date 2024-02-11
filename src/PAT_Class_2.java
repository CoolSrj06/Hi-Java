import java.util.Scanner;

public class PAT_Class_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        subclass sb=new subclass();
        int ans=sb.a+ sb.b;
        System.out.println("Enter value of C and D");
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        System.out.println(ans==sb.sum(c,d));
    }
}
class subclass{
    int a=20;
    int b=10;
    int sum(int c,int d){
        return c+d;
    }
}

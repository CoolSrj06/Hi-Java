import java.util.Stack;

public class Parenthesis_Checker {
    public static void main(String[] args) {
        String s="]";
        System.out.println(ispar(s));
    }
    public static boolean ispar(String x)
    {
        Stack<Character> s=new Stack<>();
        int n=0;
        while (n<x.length()){
            if ((x.charAt(n)=='{')||(x.charAt(n)=='[')||(x.charAt(n)=='('))
                s.add(x.charAt(n));
            else if (!s.isEmpty()&&((x.charAt(n)==']'& s.peek()=='[')||(x.charAt(n)=='}'& s.peek()=='{')||(x.charAt(n)==')'& s.peek()=='(')))
                s.pop();
            else
                return false;

            n++;
        }
        if (!s.isEmpty())
            return false;
        else return true;
    }
}

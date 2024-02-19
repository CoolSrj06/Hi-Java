import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("geeksforgeeks","forgeeksgeeks"));
    }
    public static boolean isAnagram(String a,String b)
    {

        // Your code here
        char[] A=new char[a.length()];
        char[] B=new char[b.length()];
        for (int i=0;i<a.length();i++) {
            A[i]=a.charAt(i);
        }
        for (int i=0;i<b.length();i++) {
            B[i]=b.charAt(i);
        }
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println(Arrays.toString(A));
        if (Arrays.equals(A, B))
            return true;
        else
            return false;
    }
}

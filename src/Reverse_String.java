public class Reverse_String {
    public static void main(String[] args) {
        System.out.println(reverseWord("DAD n MOM"));
    }
    public static String reverseWord(String str)
    {
        return helper(str,0,"");
    }
    public static String helper(String str,int i,String w){
        if(i==str.length()){
            return w;
        }
        w=str.charAt(i)+w;
        return helper(str,i+1,w);
    }
}

import java.util.ArrayList;

public class Recamans_sequence {
    public static void main(String[] args) {
        System.out.println(recamanSequence(13));
    }

    static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(n>0)
            ans.add(0);
        for (int i = 1; i < n; i++) {
            int temp=ans.get(i-1)-i;
            if (temp<=0||ans.contains(temp))
                temp=ans.get(i-1)+i;
            ans.add(temp);
        }
        return ans;
    }
}

import java.util.HashMap;

public class Key_Pair {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr={1,5,10,6,8};
        int x=16;
        //calling keyPair
        System.out.println(keyPair(arr,5,x));

        for (int val:arr) {
            map.put(val,x-val);
        }
        int c=0;
        for (int val:arr) {
            if(map.containsKey(map.get(val))&&val!=map.get(val)) {
                System.out.println("true");
                c++;
                break;
            }
        }
        if (c==0)
            System.out.println("false");

    }
    public static boolean keyPair(int[] arr,int n,int x){
        HashMap<Integer, Integer> a = new HashMap<>();
        for(int i=0; i<n; i++){
            if(a.containsKey(x-arr[i])){
                return true;
            }else{
                a.put(arr[i],a.getOrDefault(arr[i],0)+1);
            }
        }
        return false;
    }
}

public class Print_1_To_N_Without_Loop {
    public static void main(String[] args) {
        printNos(10);
    }
    public static void printNos(int N)
    {
        if(N==0)
            return;
        printNos(N-1);
        System.out.print(N+" ");
    }

}

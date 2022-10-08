package gfg;

public class PrintNToOneWithoutLoop{
    public void printNos(int N){
        // code here
        if(N > 0){
            System.out.print(N + " ");
            printNos(N - 1);
        }
    }
}

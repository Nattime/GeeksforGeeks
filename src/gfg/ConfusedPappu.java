package gfg;

public class ConfusedPappu{
    public long findDiff(long amount){
        // code here
        long op = 0L;
        long dec = 1L;
        while(amount > 0L){
            if((amount % 10L) == 6L){
                op += 3L * dec;
            }
            amount /= 10L;
            dec *= 10L;
        }
        return op;
    }
}

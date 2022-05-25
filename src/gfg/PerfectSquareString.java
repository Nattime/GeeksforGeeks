package gfg;

public class PerfectSquareString{
    static int isSquare(String S){
        //code here
        int sum = 0;
        for(int i = 0; i < S.length(); i++){
            sum += (int)(S.charAt(i));
        }
        int sq = (int)Math.sqrt(sum);
        return sq * sq == sum ? 1 : 0;
    }
}

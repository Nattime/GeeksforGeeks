package gfg;

public class PerfectReversibleString{
    public int isReversible(String str, int n){
        //complete the function here
        for(int i = 0, j = str.length() - 1; i < j; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                return 0;
            }
        }
        return 1;
    }
}

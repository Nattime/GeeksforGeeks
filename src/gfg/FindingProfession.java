package gfg;

public class FindingProfession{
    public static char profession(int level, int pos){
        // code here
        return (Integer.bitCount(pos - 1) & 1) == 0 ? 'e' : 'd';
    }
}

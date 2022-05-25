package gfg;

public class PossibleTimings{
    public static int numberOfPossibleTimings(String S){
        // code here
        int[] arr = {2, 7, 2, 3, 3, 4, 2, 5, 1, 2};
        return S.length() == 2 ? arr[(S.charAt(0) - '0')] * arr[(S.charAt(1) - '0')] : arr[(S.charAt(0) - '0')];
    }
}

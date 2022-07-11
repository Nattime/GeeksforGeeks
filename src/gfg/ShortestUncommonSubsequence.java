package gfg;

public class ShortestUncommonSubsequence{
    public static int shortestUnSub(String S, String T){
        // code here
        int sLen = S.length(), tLen = T.length();
        int[][] dp = new int[sLen + 1][tLen + 1];
        int MAX = 600;
        for(int i = 0; i <= sLen; i++){
            dp[i][0] = 1;
        }
        for(int i = 0; i <= tLen; i++){
            dp[0][i] = MAX;
        }
        for(int i = 1; i <= sLen; i++){
            for(int j = 1; j <= tLen; j++){
                int k = j - 1;
                for(; k >= 0; k--){
                    if(T.charAt(k) == S.charAt(i - 1)){
                        break;
                    }
                }
                if(k < 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][k] + 1);
                }
            }
        }
        if(dp[sLen][tLen] >= MAX){
            return -1;
        }

        return dp[sLen][tLen];
    }
}

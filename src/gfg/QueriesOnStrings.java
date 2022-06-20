package gfg;

import resources.Print;

import java.util.HashSet;
import java.util.Set;

public class QueriesOnStrings{
    public int[] SolveQueris(String str, int[][] Query){
        // Code here
        int[] a = new int[Query.length];
        int len = str.length();
        int[][] mat = new int[26][len + 1];
        for(int i = 0; i < len; i++){
            int ind = (int)(str.charAt(i) - 'a');
            for(int j = i + 1; j <= len; j++){
                mat[ind][j]++;
            }
        }
        for(int i = 0; i < Query.length; i++){
            a[i] = help(mat, Query[i][0], Query[i][1]);
        }
        return a;
    }

    private int help(int[][] mat, int i, int i1){
        int sum = 0;
        for(int row = 0; row < 26; row++){
            if((mat[row][i1] - mat[row][i - 1]) >= 1){
                sum++;
            }
        }
        return sum;
    }
}

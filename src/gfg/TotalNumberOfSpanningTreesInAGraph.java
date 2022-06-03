package gfg;

import resources.Print;

import java.util.ArrayList;

public class TotalNumberOfSpanningTreesInAGraph{
    public static int countSpanningTrees(int[][] graph, int n, int m){
        int[][] matrix = new int[n - 1][n - 1];
        for(int[] ints : graph){
            int u = ints[0];
            int v = ints[1];
            if(u > 0 && v > 0){
                matrix[u - 1][v - 1] = -1;
                matrix[v - 1][u - 1] = -1;
                matrix[v - 1][v - 1]++;
                matrix[u - 1][u - 1]++;
            }else{
                if(u == 0){
                    matrix[v - 1][v - 1]++;
                }
                if(v == 0){
                    matrix[u - 1][u - 1]++;
                }
            }
        }
        return findDeterminant(matrix);
    }

    private static int findDeterminant(int[][] matrix){
        int det = 0;
        if(matrix.length == 1){
            return matrix[0][0];
        }else if(matrix.length == 2){
            return (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
        }else{
            int len = matrix.length;
            for(int k = 0; k < matrix.length; k++){
                int[][] mat = new int[len - 1][len - 1];
                for(int i = 1; i < len; i++){
                    int ind = 0;
                    for(int j = 0; j < matrix.length; j++){
                        if(j != k){
                            mat[i - 1][ind++] = matrix[i][j];
                        }
                    }
                }
                det += (matrix[0][k] * (int)Math.pow(-1, k) * findDeterminant(mat));
            }
            return det;
        }
    }
}

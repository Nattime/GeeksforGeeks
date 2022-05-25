package gfg;

public class SwappingTriangles{
    int[][] swapTriangle(int N, int A[][]){
        // code here
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }
}

public class KroneckerProduct{
    int[][] kroneckerProduct(int n, int m, int p, int q, int A[][], int B[][]){
        int ans[][] = new int[n * p][m * q];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                for(int k = 0; k < p; k++)
                    for(int l = 0; l < q; l++)
                        ans[i * p + k][j * q + l] = A[i][j] * B[k][l];
        return ans;
    }
}

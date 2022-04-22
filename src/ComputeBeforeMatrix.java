public class ComputeBeforeMatrix {
    public int[][] computeBeforeMatrix(int N, int M,int[][] after ){
        // Code here
        int[][] arr = new int[N][M];
        arr[0][0] = after[0][0];
        for(int row = 0; row < N; row++){
            for(int col = 0; col < M; col++){
                if(row > 0 && col > 0){
                    arr[row][col] = after[row][col] + after[row - 1][col - 1] - after[row - 1][col] - after[row][col - 1];
                }else if(col == 0 && row > 0){
                    arr[row][col] = after[row][col] - after[row - 1][col];
                }else if(col > 0){
                    arr[row][col] = after[row][col] - after[row][col - 1];
                }
            }
        }
        return arr;
    }
}

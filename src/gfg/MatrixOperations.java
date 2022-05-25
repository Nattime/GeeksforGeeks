package gfg;

public class MatrixOperations{
    public static int[] endPoints(int[][] arr, int m, int n){
        //code here
        int[] ret = {0, 0};
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int d = 0;
        while(ret[0] < m && ret[1] < n){
//            System.out.println(ret[0] + " " + ret[1]);
            if(arr[ret[0]][ret[1]] == 1){
                arr[ret[0]][ret[1]] = 0;
                d = (d + 1) % 4;
            }
            ret[0] += dir[d][0];
            ret[1] += dir[d][1];
//            System.out.println(ret[0] + " " + ret[1] + " " + d);
            if(ret[0] < 0 || ret[0] >= m || ret[1] < 0 || ret[1] >= n){
                ret[0] -= dir[d][0];
                ret[1] -= dir[d][1];
                return ret;
            }
        }

        return ret;
    }
}

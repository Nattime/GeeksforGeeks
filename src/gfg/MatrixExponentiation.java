package gfg;

public class MatrixExponentiation{
    final long mod = (long)(1e9 + 7);

    public int FindNthTerm(int n){
        // code here
        if(n == 0){
            return 0;
        }
        long[][] arr = new long[][]{{1, 1}, {1, 0}};
        help(arr, n);
        return (int)(arr[0][0] % mod);
    }

    private void help(long[][] arr, int n){
        if(n > 1){
            long[][] mat = new long[][]{{1, 1}, {1, 0}};
            help(arr, n / 2);
            multiply(arr, arr);
            if(n % 2 == 1){
                multiply(arr, mat);
            }
        }
    }

    private void multiply(long[][] mat1, long[][] mat2){
        long i1 = mat1[0][0];
        long j1 = mat1[0][1];
        long x1 = mat1[1][0];
        long y1 = mat1[1][1];

        long i2 = mat2[0][0];
        long j2 = mat2[0][1];
        long x2 = mat2[1][0];
        long y2 = mat2[1][1];

        mat1[0][0] = (i1 * i2 + j1 * x2) % mod;
        mat1[0][1] = (i1 * j2 + j1 * y2) % mod;
        mat1[1][0] = (x1 * i2 + y1 * x2) % mod;
        mat1[1][1] = (x1 * j2 + y1 * y2) % mod;
    }
}

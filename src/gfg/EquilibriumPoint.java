package gfg;

public class EquilibriumPoint {
    public static int equilibriumPoint(long[] arr, int n) {
        // Your code here
        if (n == 1) {
            return 1;
        }
        int l = 0, r = n - 1;
        int left = 0, right = 0;
        while (l <= r) {
            if (l == r && left == right) {
                return l + 1;
            }
            if (left < right) {
                left += arr[l++];
            } else {
                right += arr[r--];
            }
        }
        return -1;
    }
}

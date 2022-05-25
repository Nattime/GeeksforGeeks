package gfg;

import java.util.ArrayList;

public class NDigitNumbersWithDigitsInIncreasingOrder{
    static ArrayList<Integer> increasingNumbers(int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
//        String numbers = "123456789";
        if(N == 1){
            list.add(0);
        }
        help(0, N, list);
        return list;
    }

    static void help(int num, int n, ArrayList<Integer> list){
        if(n == 0){
            list.add(num);
        }else{
            int m = num;
            for(int i = (num % 10) + 1; i < 10; i++){
                num = m * 10 + i;
                help(num, n - 1, list);
            }
        }
    }
}

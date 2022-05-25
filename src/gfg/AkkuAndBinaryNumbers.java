package gfg;

import java.util.HashSet;
import java.util.Set;

public class AkkuAndBinaryNumbers {
    void precompute(){
    }
    long solve(long L, long R){
        long count = 0L;
        for(long i = 1L; i < R; i <<= 1L){
            for(long j = (i << 1L); j < R; j <<= 1L){
                for(long k = (j << 1L); k < R; k <<= 1L){
                    long num = (i | j | k);
                    if(L <= num && num <= R){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

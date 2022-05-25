package gfg;

public class CheckIfDivisibleByFour{
    int divisibleBy4(String N){
        // Your Code Here
        return N.length() < 5 ? (Integer.parseInt(N) % 4 == 0 ? 1 : 0) : ((Integer.parseInt(N.substring(N.length() - 4)) % 4 == 0) ? 1 : 0);
    }
}

package gfg;

public class CheckIfDivisibleByFive{
    static int divisibleBy5(String N){
        // code here
        return Integer.parseInt(N.substring(N.length() - 1)) % 5 == 0 ? 1 : 0;
    }
}

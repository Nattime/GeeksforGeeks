package gfg;

public class TriangleGrowingDownwards{
    static void printTriangleDownwards(String str){
        // code here
        StringBuilder s = new StringBuilder();
        s.append(".".repeat(Math.max(0, str.length() - 1)));
        for(int i = str.length() - 1; i >= 0; i--){
            System.out.println(s.substring(0, i) + str.substring(0, str.length() - i));
        }
    }
}

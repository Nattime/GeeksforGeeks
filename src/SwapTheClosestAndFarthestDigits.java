public class SwapTheClosestAndFarthestDigits{
    static class Str{
        String val;

        public Str(String val){
            this.val = val;
        }

        @Override
        public String toString(){
            return val;
        }
    }

    void swapDigits(Str n1, Str n2){
        String s1 = n2.val.substring(n2.val.length() - 1) + n1.val.substring(1, n1.val.length() - 1) + n2.val.charAt(0);
        String s2 = n1.val.substring(n1.val.length() - 1) + n2.val.substring(1, n2.val.length() - 1) + n1.val.charAt(0);
        n1.val = s1;
        n2.val = s2;
    }
}

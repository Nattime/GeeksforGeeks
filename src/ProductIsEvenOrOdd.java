public class ProductIsEvenOrOdd{
    int EvenOdd(String n1, String n2){
        //code here.
        return (n1.charAt(n1.length() - 1) - '0') % 2 == 0 ? 1 : (n2.charAt(n2.length() - 1) - '0') % 2 == 0 ? 1 : 0;
    }
}

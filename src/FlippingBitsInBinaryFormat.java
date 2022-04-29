import java.util.ArrayList;
import java.util.List;

public class FlippingBitsInBinaryFormat{
    List<String> flipBits(long N){
        // code here

        StringBuilder bit = new StringBuilder();

        for(int i = 1; i <= 32; i++){
            long num = (N & 1);
            if(num == 1L){
                bit.append(0);
            }else{
                bit.append(1);
            }

            N >>= 1;
        }
        long number = 0L;
        for(int i = bit.length() - 1; i >= 0; i--){
            number <<= 1L;
            if((bit.charAt(i) - '0') == 1L){
                number |= 1L;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(number + "");
        list.add(bit.toString().trim());
        return list;
    }
}

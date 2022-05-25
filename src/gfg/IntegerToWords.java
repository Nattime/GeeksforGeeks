package gfg;

public class IntegerToWords {
    String[] ones = new String[]{"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
    String[] tens = new String[]{"", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};

    String convertToWords(long n) {
        // code here
        StringBuilder str = new StringBuilder();

        if(n >= 10000000L){
            int rem = (int)(n / 10000000L);
            str.append(addString(rem));
            // System.out.println("rem: " + rem + " " + n);
            str.append("crore ");
            n = n % 10000000L;
        }
        if(n >= 100000L){
            int rem = (int)(n / 100000L);
            str.append(addString(rem));
            // System.out.println("rem: " + rem + " " + n);
            str.append("lakh ");
            n = n % 100000L;
        }
        if(n >= 1000L){
            int rem = (int)(n / 1000L);
            str.append(addString(rem));
            // System.out.println("rem: " + rem + " " + n);
            str.append("thousand ");
            n = n % 1000L;
        }
        if(n >= 100L){
            int rem = (int)(n / 100L);
            str.append(addString(rem));
            // System.out.println("rem: " + rem + " " + n);
            str.append("hundred ");
            n = n % 100L;
        }
        if(n > 0){
            int rem = (int)(n);
            if(str.length() > 0){
                str.append("and ");
            }
            str.append(addString(rem));
            // System.out.println("rem: " + rem + " " + n);
        }

        return str.toString().trim();
    }
    String addString(int rem){
        if(rem > 19){
            return tens[rem / 10] + ones[rem % 10];
        }else{
            return ones[rem];
        }
    }
}

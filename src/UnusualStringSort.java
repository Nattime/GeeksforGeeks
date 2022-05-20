public class UnusualStringSort{
    public static String stringSort(String s){
        // your code here
        int[] upper = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] lower = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                upper[(ch - 'A')]++;
            }else{
                lower[(ch - 'a')]++;
            }
        }
        int uInd = 0;
        int lInd = 0;
        boolean isUp = true;
        for(int i = 0; i < s.length(); i++){
            if(isUp){
                while(isUp){
                    if(uInd >= 26){
                        isUp = false;
                        i--;
                    }else{
                        if(upper[uInd] > 0){
                            str.append((char)(uInd + 'A'));
                            upper[uInd]--;
                            isUp = false;
                        }else{
                            uInd++;
                        }
                    }
                }
                isUp = lInd >= 26;
            }else{
                while(!isUp){
                    if(lInd >= 26){
                        i--;
                        isUp = true;
                    }else{
                        if(lower[lInd] > 0){
                            str.append((char)(lInd + 'a'));
                            lower[lInd]--;
                            isUp = true;
                        }else{
                            lInd++;
                        }
                    }
                }
                isUp = uInd < 26;
            }
        }
        return str.toString();
    }
}

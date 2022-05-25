package gfg;

public class OperatingAnArray {
    public int[] operate(int[] a, int[] op){
        int[] ret = new int[3];
        ret[0] = (searchEle(a, op[0])) ? 1 : 0;
        ret[1] = (insertEle(a, op[1], op[2])) ? 1 : 0;
        ret[2] = (deleteEle(a, op[3])) ? 1 : 0;
        return ret;
    }
    public boolean searchEle(int[] a,int x)
    {
        //add code here.
        for(int iter : a){
            if(iter == x){
                return true;
            }
        }
        return false;
    }
    public boolean insertEle(int[] a,int y,int yi)
    {
        //add code here.
        if(yi >= a.length){
            return false;
        }
        a[yi] = y;
        return true;
    }
    public boolean deleteEle(int[] a,int z)
    {
        //add code here.
        boolean hasEle = false;

        for(int i = 0; i < a.length; i++){
            if(hasEle){
                if(i + 1 < a.length){
                    a[i] = a[i + 1];
                }else{
                    a[i] = -1;
                }
            }else{
                if(a[i] == z){
                    hasEle = true;
                    i--;
                }
            }
        }

        return true;
    }
}

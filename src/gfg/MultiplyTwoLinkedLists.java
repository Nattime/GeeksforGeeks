package gfg;

import resources.Node;

public class MultiplyTwoLinkedLists {
    public static long multiplyTwoLists(Node l1, Node l2){
        //add code here.
        long num1 = 0L;
        long num2 = 0L;
        long mod = 1000000007L;
        while(l1 != null){
            num1 *= 10;
            num1 += l1.data;
            num1 = num1 % mod;
            l1 = l1.next;
        }
        while(l2 != null){
            num2 *= 10;
            num2 += l2.data;
            num2 = num2 % mod;
            l2 = l2.next;
        }
        return ((num1 * num2)) % (mod);
    }
}

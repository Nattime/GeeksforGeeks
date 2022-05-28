package gfg;

import resources.Node;

public class ValentineSum{
    public static int sum_at_distK(Node root, int target, int k){
        // Your code goes here
        int[] arr = {0};
        help(root, target, arr, k, k);
        return arr[0];
    }

    static int help(Node root, int target, int[] arr, int range, int k){
        if(root != null && k >= 0){
            if(root.data == target || k != range){
                arr[0] += root.data;
                help(root.left, target, arr, range, k - 1);
                help(root.right, target, arr, range, k - 1);
                return k - 1;
            }else{
                int num = help(root.left, target, arr, range, k);
                if(num != -1){
                    arr[0] += root.data;
                    help(root.right, target, arr, range, num - 1);
                    return num - 1;
                }
                num = help(root.right, target, arr, range, k);
                if(num != -1){
                    arr[0] += root.data;
                    help(root.left, target, arr, range, num - 1);
                    return num - 1;
                }
            }
        }
        return -1;
    }
}

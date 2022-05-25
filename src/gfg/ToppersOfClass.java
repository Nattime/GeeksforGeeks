package gfg;

import java.util.*;

public class ToppersOfClass{
    public static class node{
        int marks;
        int index;

        public void setMarks(int a){
            this.marks = a;
        }

        public void setIndex(int b){
            this.index = b;
        }
    }

    public static node[] makeNode(int[] arr){
        node[] ret = new node[arr.length];
        for(int i = 0; i < arr.length; i++){
            node n = new node();
            n.setMarks(arr[i]);
            n.setIndex(i);
            ret[i] = n;
        }
        return ret;
    }

    public static void print(node[] arr, int count){
        Set<Integer> s = new HashSet<>();
        int c = 0;
        for(node iter : arr){
            if(s.contains(iter.marks)){
                c++;
            }else{
                if(s.size() < count){
                    c++;
                    s.add(iter.marks);
                }
            }
        }
        for(int i = 0; i < c; i++){
            System.out.print(arr[i].index + " ");
        }

        System.out.println();
    }

    public void kTop(node[] a, int n){
        // Your code goes here
        Arrays.sort(a, (x, y)->y.marks == x.marks ? x.index - y.index : y.marks - x.marks);
    }
}


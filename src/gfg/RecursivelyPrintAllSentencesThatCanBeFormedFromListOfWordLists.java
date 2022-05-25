package gfg;

import java.util.ArrayList;

public class RecursivelyPrintAllSentencesThatCanBeFormedFromListOfWordLists{
    public static ArrayList<ArrayList<String>> ret = new ArrayList<>();

    public static ArrayList<ArrayList<String>> sentences(String[][] list){
        // code here
        for(int col = 0; col < list[0].length; col++){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(list[0][col]);
            help(list, 1, arr);
        }
        return ret;
    }

    public static void help(String[][] list, int row, ArrayList<String> arr){
        if(row >= list.length){
            ret.add(arr);
        }else{
            for(int i = 0; i < list[row].length; i++){
                ArrayList<String> al = new ArrayList<>(arr);
                al.add(list[row][i]);
                help(list, row + 1, al);
            }
        }
    }
}

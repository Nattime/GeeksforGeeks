package gfg;

import java.util.ArrayList;

public class FindAllPossiblePathsFromTopToBottom{
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n, int m, int[][] grid){
        // code here
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        help(ret, list, 0, 0, grid);
        return ret;
    }

    private static void help(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> list, int row, int col, int[][] grid){
        if(row == grid.length - 1 && col == grid[0].length - 1){
            list.add(grid[row][col]);
            ret.add(list);
            return;
        }
        if(row < grid.length && col < grid[row].length){
            ArrayList<Integer> temp = new ArrayList<>(list);
            temp.add(grid[row][col]);
            help(ret, temp, row + 1, col, grid);
            help(ret, temp, row, col + 1, grid);
        }
    }
}

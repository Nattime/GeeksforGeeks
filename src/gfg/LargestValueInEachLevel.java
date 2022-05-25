package gfg;

import resources.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LargestValueInEachLevel{
    public ArrayList<Integer> largestValues(Node root){
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int max = q.peek().data;
            for(int i = 0;i < size;i++){
                Node curr = q.remove();
                max = Math.max(max, curr.data);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            list.add(max);
        }
        return list;
    }
}

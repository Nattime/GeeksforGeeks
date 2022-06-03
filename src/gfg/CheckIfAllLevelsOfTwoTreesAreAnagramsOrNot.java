package gfg;

import resources.Node;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIfAllLevelsOfTwoTreesAreAnagramsOrNot{
    public static boolean areAnagrams(Node node1, Node node2){
        // code here
        Queue<Node> q1 = new LinkedList<>();
        q1.add(node1);
        q1.add(node2);
        while(!q1.isEmpty()){
            int num = 0;
            int size = q1.size() / 2;
            for(int i = 0; i < size; i++){
                Node curr = q1.poll();
                num += curr.data;
                if(curr.left != null){
                    q1.add(curr.left);
                }
                if(curr.right != null){
                    q1.add(curr.right);
                }
            }
            for(int i = 0; i < size; i++){
                Node curr = q1.poll();
                num -= curr.data;
                if(curr.left != null){
                    q1.add(curr.left);
                }
                if(curr.right != null){
                    q1.add(curr.right);
                }
            }
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}

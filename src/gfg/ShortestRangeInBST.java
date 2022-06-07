package gfg;

import resources.Node;

import java.util.*;

public class ShortestRangeInBST{
    public static class TempNode implements Comparable{
        public int value;
        public int listNum;
        public int index;

        TempNode(int value, int listNum, int index){
            this.value = value;
            this.listNum = listNum;
            this.index = index;
        }

        @Override
        public int compareTo(Object o){
            TempNode node = (TempNode)o;
            return value - node.value;
        }
    }

    public Range shortestRange(Node root){
        // Your code goes here
        List<Node> l = new ArrayList<>();
        l.add(root);
        int maximum = Integer.MIN_VALUE;
        Range ret = new Range(0, Integer.MAX_VALUE);
        PriorityQueue<TempNode> pq = new PriorityQueue<>();
        List<List<Node>> list = new ArrayList<>();
        while(!l.isEmpty()){
            TempNode t = new TempNode(l.get(0).data, list.size(), 0);
            list.add(l);
            List<Node> temp = new ArrayList<>();
            for(Node iter : l){
                if(iter.left != null){
                    temp.add(iter.left);
                }
                if(iter.right != null){
                    temp.add(iter.right);
                }
            }
            l = temp;
            pq.add(t);
            maximum = Integer.max(maximum, t.value);
        }

        while(true){
            TempNode top = pq.poll();
            int minimum = top.value;
            int i = top.listNum;
            int j = top.index;
            if(maximum - minimum < ret.y - ret.x){
                ret.x = minimum;
                ret.y = maximum;
            }
            if(j == list.get(i).size() - 1){
                return ret;
            }
            int num = list.get(i).get(j + 1).data;
            pq.add(new TempNode(num, i, j + 1));
            maximum = Integer.max(maximum, num);
        }
    }

    public static class Range{
        public int x, y;

        Range(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}

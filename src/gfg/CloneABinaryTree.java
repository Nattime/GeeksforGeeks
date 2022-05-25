package gfg;

import resources.Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CloneABinaryTree {
    public Tree cloneTree(Tree tree){
        // add code here.
        Tree ret = null;
        if(tree != null){
            ret = new Tree(tree.data);
            Map<Integer, Tree> map = new HashMap<>();
            map.put(tree.data, ret);
            Queue<Tree> que = new LinkedList<>();
            que.add(tree);
            while(!que.isEmpty()){
                Tree temp = que.remove();
                Tree curr = map.get(temp.data);

                if(temp.left != null){
                    que.add(temp.left);
                    if(map.containsKey(temp.left.data)){
                        curr.left = map.get(temp.left.data);
                    }else{
                        Tree newTree = new Tree(temp.left.data);
                        map.put(temp.left.data, newTree);
                        curr.left = newTree;
                    }
                }
                if(temp.right != null){
                    que.add(temp.right);
                    if(map.containsKey(temp.right.data)){
                        curr.right = map.get(temp.right.data);
                    }else{
                        Tree newTree = new Tree(temp.right.data);
                        map.put(temp.right.data, newTree);
                        curr.right = newTree;
                    }
                }
                if(temp.random != null){
                    if(map.containsKey(temp.random.data)){
                        curr.random = map.get(temp.random.data);
                    }else{
                        Tree newTree = new Tree(temp.random.data);
                        map.put(temp.random.data, newTree);
                        curr.random = newTree;
                    }
                }
            }

        }
        return ret;
    }
}

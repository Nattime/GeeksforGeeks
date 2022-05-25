package gfg;

import resources.Node;

public class FlattenBinaryTreeToLinkedList{
    public static void flatten(Node root){
        //code here
        if(root != null){
            if(root.left != null && root.right != null){
                Node trav = root.left;
                while(trav.right != null){
                    trav = trav.right;
                }
                trav.right = root.right;
                root.right = root.left;
                root.left = null;
            }else if(root.right == null){
                root.right = root.left;
                root.left = null;
            }
            flatten(root.right);
        }
    }
}

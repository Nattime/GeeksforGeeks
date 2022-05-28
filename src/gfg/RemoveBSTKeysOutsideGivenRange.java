package gfg;

import resources.Node;
import resources.Print;

public class RemoveBSTKeysOutsideGivenRange{
    public Node removekeys(Node root, int l, int r){
        Node ret = help(root, l, r);
        if(root != ret){
            root.left = null;
            root.right = null;
        }
        return ret;
    }

    public Node help(Node root, int l, int r){
        // code here
        if(root == null){
            return null;
        }
        root.left = help(root.left, l, r);
        root.right = help(root.right, l, r);

        if(root.data < l){
            return help(root.right, l, r);
        }else if(root.data > r){
            return help(root.left, l, r);
        }
        return root;
    }
}

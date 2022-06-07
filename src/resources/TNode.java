package resources;

public class TNode extends Node{
    public int data;
    public TNode left, right;

    public TNode(int x){
        data = x;
        left = right = null;
    }
}

package resources;

public class LNode extends Node{
    public int data;
    public LNode next;
    public LNode(int d){
        super(d);
        data = d;
        next = null;
    }
}

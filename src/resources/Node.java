package resources;

public class Node{
    public int data;
    public Node next, prev, left, right;

    public Node(){
    }

    public Node(int data){
        setData(data);
        next = prev = left = right = null;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNext(Node n){
        next = n;
    }

    public void setPrev(Node n){
        left = prev = n;
    }

    public void setLeft(Node n){
        left = n;
    }

    public void setRight(Node n){
        right = n;
    }

    public int getData(){
        return data;
    }

    public Node getPrev(){
        return prev;
    }

    public Node getNext(){
        return next;
    }

    @Override
    public String toString(){
        return getData() + " ";
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }
}

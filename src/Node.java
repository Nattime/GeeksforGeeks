public class Node {
    int data;
    Node next, prev, left, right;
    Node(){

    }

    Node(int data){
        setData(data);
        next = prev = left = right = null;
    }
    void setData(int data){
        this.data = data;
    }
    void setNext(Node n){
        right = next = n;
    }
    void setPrev(Node n){
        left = prev = n;
    }
    void setLeft(Node n){
        setPrev(n);
    }
    void setRight(Node n){
        setNext(n);
    }
    int getData(){
        return data;
    }
    Node getPrev(){
        if(left != null){
            return left;
        }
        return prev;
    }
    Node getNext(){
        if(right != null){
            return right;
        }
        return next;
    }
    Node getLeft(){
        return getPrev();
    }
    Node getRight(){
        return getNext();
    }
}

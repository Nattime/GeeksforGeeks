public class Node {
    int data;
    Node next, prev, left, right;
    Node(int data){
        this.data = data;
        next = prev = left = right = null;
    }
}

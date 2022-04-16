public class Tree extends Node{
    Tree random, left, right;

    Tree(int data) {
        super(data);
    }
    Tree(int data, Tree l, Tree r){
        this.data = data;
        left = l;
        right = r;
    }
    Tree(int data, Tree l, Tree r, Tree random){
        this.data = data;
        left = l;
        right = r;
        this.random = random;
    }
    Tree(int data, int l, int r){
        this.data = data;
        left = new Tree(l);
        right = new Tree(r);
    }
    void setRandom(Tree tree){
        random = tree;
    }
}

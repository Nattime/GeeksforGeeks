public class Create {
    static Node createBST(int[] arr){
        if(arr.length < 1){
            return null;
        }
        Node root = new Node(arr[0]);
        for(int i = 1; i < arr.length; i++){
            bstAdd(root, arr[i]);
        }
        return root;
    }
    static void bstAdd(Node root, int num){
        if(root != null){
            if(root.data > num){
                if(root.prev != null){
                    bstAdd(root.prev, num);
                }else{
                    root.prev = new Node(num);
                }
            }else if(root.data < num){
                if(root.next != null){
                    bstAdd(root.next, num);
                }else{
                    root.next = new Node(num);
                }
            }
        }


    }
    static Node createNodeLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node trav = head;
        for(int i = 1; i < arr.length; i++){
            trav.next = new Node(arr[i]);
            trav = trav.next;
        }
        return head;
    }
    static Node createCircularLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node trav = head;
        for(int i = 1; i < arr.length; i++){
            trav.next = new Node(arr[i]);
            trav = trav.next;
        }
        trav.next = head;
        return head;
    }
}

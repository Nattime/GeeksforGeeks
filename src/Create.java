public class Create {
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

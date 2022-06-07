package gfg;

import resources.LNode;
import resources.TNode;

import java.util.ArrayList;
import java.util.List;

public class SortedLinkListToBST{
    public TNode sortedListToBST(LNode head){
        //code here
        List<LNode> list = new ArrayList<>();
        LNode trav = head;
        while(trav != null){
            list.add(trav);
            trav = trav.next;
        }
        return build(list, 0, list.size());
    }

    public TNode build(List<LNode> list, int begin, int end){
        if(begin == end){
            return null;
        }else{
            int mid = (begin + end) / 2;
            // System.out.println("\tmid: " + mid);
            TNode mNode = new TNode(list.get(mid).data);
            mNode.left = build(list, begin, mid);
            mNode.right = build(list, mid + 1, end);
            return mNode;
        }
    }
}

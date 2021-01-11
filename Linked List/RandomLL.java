import java.util.Random;

//Random Singly Linked List 
import java.util.*;
public class RandomLL {

    /* @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    ArrayList<Integer> list = new ArrayList<>();
    public RandomLL(Node head) {
        while(head!=null){
            list.add(head.data);
            head = head.next;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        return list.get((int)(Math.random()*list.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
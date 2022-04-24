/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class DetectingCycle {
    public boolean hasCycle(ListNode head) {
        // Floyd's algorithm
        ListNode hare = head;
        ListNode turtle = head;
        
        while(hare != null  && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            
            if(hare == turtle){
                return true;
            }
          
        }
        
        return false;
    }
}

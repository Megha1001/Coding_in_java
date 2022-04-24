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
 * Run at :  https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class FindFirtNodeInLoop {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }
        
        boolean isCycleExist = false;
        ListNode hare = head;
        ListNode turtle = head;
        
        // TO Detect cycle --> move hare by 2 position and turtle by one position if they meet at some position it means there is a cycle in linked list
        
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            
            if(hare == turtle){
                
                isCycleExist = true;
                break;
            }
        }
        
        System.out.println("Cycle exist : "+ isCycleExist);
       /* To find the starting of loop --> 1. detect cycle by Floyd's algo, if loop is found ,intiallize turtle to head and let hare be at its position
            2. move both (turtle and hare) one node at the time
            3. The  point at which they meet is the start of the loop
        */ 
        if(isCycleExist){
            turtle = head;
            while(hare != turtle){
            hare = hare.next;
            turtle = turtle.next;
            }
            return hare;
        
        }
        return null;
        
    }
}

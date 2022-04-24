/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * INPUT : 1 --> 2 -->3 -->4 --> NULL
 * OUTPUT : 2 --> 1 --> 4 -->3 --> NULL
 *
 *
 *
 */
class SwappingPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode currNode = head;
        ListNode newHead  = head.next;
        
        while(currNode != null && currNode.next != null){
            ListNode temp = currNode;
            currNode = currNode.next;
            temp.next = currNode.next;
            currNode.next = temp;
            currNode = temp.next;
            
            if(currNode != null && currNode.next != null){
                temp.next = currNode.next;
            }
                
        }
        return newHead;
    }
}

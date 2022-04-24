/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// Run at : https://leetcode.com/problems/palindrome-linked-list/
class PalindromeLinkedList {
    
    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        
        return turtle;
    }
    
    public ListNode reverse(ListNode head){
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
                
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
        
    }

    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode middle = findMiddle(head); // give last element of first half
        
        ListNode secondHalfStart = reverse(middle.next);
        
        ListNode firstHalfStart =  head;
        
        while(secondHalfStart != null){
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        
        return true;
        
    }
}

//Question :https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-LinkedList/problem/insert-in-middle-of-linked-list

class Solution {
    
    public Node insertInMid(Node head, int data){
       
       Node slow = head;
       Node fast = head;
       Node newNode = new  Node(data);
       
       if(head == null){
           return newNode;
       }
       
       while(fast.next !=null && fast.next.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       
       newNode.next = slow.next;
       slow.next = newNode;
       
       return head;
    
    }
}

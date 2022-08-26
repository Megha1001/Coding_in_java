//Question : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-LinkedList/problem/linked-list-insertion-1587115620

class Solution
{
    //Function to insert a node at the beginning of the linked list.
    //Time Complexity : O(1)
    Node insertAtBeginning(Node head, int x)
    {
        Node node = new Node(x);
        node.next = head;
        head = node;
        return head;
        
    }
    
    //Function to insert a node at the end of the linked list.
    //Time Complexity : O(N)
    Node insertAtEnd(Node head, int x)
    {
        Node node = new Node(x);
        Node temp = head;
        
        // if head is null then there will be no next
        if(head == null){
            return node;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        
        return head;
    }
}

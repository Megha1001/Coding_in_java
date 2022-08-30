import java.util.*;

/*
Approach : Not in place approach
1. Traverse the LL and copy the elements in arraylist
2. Now again traverse LL and copy the elment from last to first element by using a.remove(a.size()-1) function  and copy the
value in LL
3. return head;
Time Complexity : O(N)
require two traversal
*/

class ReverseLL_NaiveSol{
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
        }
    }
    
    public static void main(String [] args){
        Node head = null;
        head = addNode(head, 10);
        head = addNode(head, 20);
        head = addNode(head, 30);
        head = addNode(head, 40);
        System.out.println("Given linked list : ");
        printLL(head);
        
        System.out.println("\nReversed LL is ");
        head = reverseLL(head);
        printLL(head);
        
    }
    
    static Node reverseLL(Node head){
        if(head == null){
            return null;
        }
        
        Node curr = null;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(curr = head; curr !=null; curr = curr.next){
            a.add(curr.data);
        }
        
        for(curr = head; curr != null; curr = curr.next){
            curr.data = a.remove(a.size() -1);
        }
        
        return head;
    }
    
    static void printLL(Node head){
        if(head == null){
            return ;
        }    
        
        for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.data +" ");
        }
    }
    
    static Node addNode(Node head, int data){
        Node node = new Node(data);
        
        if(head == null){
            return node;
        }
        
        node.next = head;
        return node;
    }
    
}

/*
Given linked list : 
40 30 20 10 
Reversed LL is 
10 20 30 40 
*/

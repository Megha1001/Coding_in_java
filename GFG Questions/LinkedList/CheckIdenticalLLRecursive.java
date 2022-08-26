//Question : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-LinkedList/problem/identical-linked-lists

class CheckIdenticalLLRecursive {
    
   //Time Complexity: O(n) : where n is min(len(a,b))
   //Auxiliary Space: O(n) : for call stack
    //Function to check whether two linked lists are identical or not.
    // Recursive solutin : use stack sapce which is proportional to the length of the list
    
    public boolean isIdentical (Node head1, Node head2){
        
        return areIdenticalRecur(head1, head2);
        
    }
    
    static boolean areIdenticalRecur(Node head1, Node head2){
        
        //if both list are empty
        if(head1 == null && head2 == null){
            return true;
        }
        
        /*If both lists are not empty, then data
        current nodes must match, and same should 
        be recursively true for rest of the nodes
        */
        if(head1 != null && head2 != null){
         return (head1.data == head2.data &&
                areIdenticalRecur(head1.next, head2.next))   ;
        }
        
        
        //if we reach here then one of the list is empty and other is not
        return false;
        
    }
}

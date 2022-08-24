import java.util.*;


/*
Approach : 
    - Maintain a prev variable shared among all the variables
    - do inorder traversal
        - recursively called for left subtree 
                - ensure that prev variable has the value of last visited node key
        - current node is > prev node if not return false
        - check for right
    
    TIME COMPLEXITY : O(N)
*/

class checkForBSTO_N_UsingInOrderTrav{
    
    public static int prev = Integer.MIN_VALUE;
    
    static class Node{
        
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
        
    }
    
    public static void main(String []args){
        
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(18);
        root.right.right = new Node(35);
        
        
        System.out.println("is Given tree is BST ? "+isBST(root));
        
    }
    
    static boolean isBST(Node root){
        
        if(root == null) return true;
        
        if(! isBST(root.left)) return false;
        
        if(root.data <= prev) return false;
        
        prev = root.data;
        
        return isBST(root.right);
    }

}

import java.util.*;


/*
Approach : 
    -Pass a range for every node.
    -for root, range is +infinite to - infinite
    -for left child of a node, in range, we change upper bound as the node's value
    -for right child of a node , in range, we change lower bound as the node's value
    
    TIME COMPLEXITY : O(N)
*/

class checkForBSTO_N{
    
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
        
        Node root = new Node(80);
        root.left = new Node(70);
        root.right = new Node(90);
        root.left.left = new Node(60);
        root.left.right = new Node(75);
        root.right.left = new Node(85);
        root.right.right = new Node(100);
        
        System.out.println("is Given tree is BST ?"+checkForBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE));
        
    }
    
    static boolean checkForBST(Node root, int min, int max){
        
        if(root == null){
            return true;
        }
        
        return ( root.data > min &&
                root.data < max &&
                checkForBST(root.left, min, root.data) &&
                checkForBST(root.right, root.data, max)
            );
        
    }
}

/*
is Given tree is BST ?true
*/

import java.util.*;

class BinaryTreeHeight {
    
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree{
        static int idx = -1;
        
        public static Node buildTree(int [] nodes){
           idx ++;
           if(nodes[idx] == -1){
               return null;
           }
           Node newNode = new Node(nodes[idx]);
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           
           return newNode;
        }
        
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            
            int leftSubTreeHeight = height(root.left);
            int rightSubTreeHeight = height(root.right);
            
            int maxHeight =  Math.max(leftSubTreeHeight, rightSubTreeHeight) + 1;
            return maxHeight;
        }
    }
    
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1,-1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Node of tree : "+ root.data);
        System.out.println("Height of tree : "+tree.height(root));
  
    }
    
    /*OUTPUT
    ---------------
    Node of tree : 1
    Height of tree : 3
    */
    
}

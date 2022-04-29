import java.util.*;

class BinaryTreeSumOfNodes {
    
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
        
        public static int countOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int countOfLeftNodes = countOfNodes(root.left);
            int countOfRightNodes = countOfNodes(root.right);
            
            return countOfLeftNodes + countOfRightNodes + 1;
        }
        
        public static int sumOfNodes(Node root){
            
            if(root == null){
                return 0;
            }
            
            int sumOfLeftNodes = sumOfNodes(root.left);
            int sumOfRightNodes = sumOfNodes(root.right);
            
            return sumOfLeftNodes + sumOfRightNodes + root.data;
            
        }
    }
    
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1,-1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Node of tree : "+ root.data);
        System.out.println("Sum of Nodes : "+tree.sumOfNodes(root));
  
    }
    
    /*OUTPUT
    ---------------
    Node of tree : 1
    Sum of Nodes : 21
    */
    
}

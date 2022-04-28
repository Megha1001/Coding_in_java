import java.util.*;

class BinaryTreeLevelOrder {
    
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
            idx++;
            if(nodes[idx] == -1){ //there is a null tree
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
        
       public static void levelOrder(Node root){
           Queue<Node> q = new LinkedList<>();
           if(root == null){
               return;
           }
           
           q.add(root);
           q.add(null);
           
           while(!q.isEmpty()){
               Node currNode = q.remove();
               if(currNode == null){
                   System.out.println();
                   if(q.isEmpty()){
                       break;
                   }else{
                       q.add(null);
                   }
               }else{
                   System.out.print(currNode.data +" ");
                   if(currNode.left != null){
                       q.add(currNode.left);
                   }
                   if(currNode.right != null){
                       q.add(currNode.right);
                   }
               }
           }
           
           
       }
    }
    
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1,-1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Node of tree : "+ root.data);
        
        //Level - Order traversal - Breadth first Search
        System.out.println("LEVEL ORDER TRAVERSAL");
        tree.levelOrder(root);
        
    }
    
    /*OUTPUT
    ---------------
    Node of tree : 1
    1 
    2 3 
    4 5 6
    */
    
}

class BinaryTreeTraversal {
    
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
        
       public static void preOrder(Node root){
           if(root == null){
               return;
           }
           
           System.out.println(root.data);
           preOrder(root.left);
           preOrder(root.right);
       }
       
       public static void inOrder(Node root){
           if(root == null){
               return;
           }
           
           inOrder(root.left);
           System.out.println(root.data);
           inOrder(root.right);
       }
       
       public static void postOrder(Node root){
           if(root == null){
               return;
           }
           
           postOrder(root.left);
           postOrder(root.right);
           System.out.println(root.data);
       }
    }
    
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1,-1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Node of tree : "+ root.data);
        
        //Pre-order traversal - NLR (Node, Left, Right)
        System.out.println("PREORDER TRAVERSAL");
        tree.preOrder(root);
        
        //In-order traversal - LNR (Left, Node, Right)
        System.out.println("INORDER TRAVERSAL");
        tree.inOrder(root);
        
        //Post-order traversal - LRN (Left, Node, Right)
        System.out.println("POSTORDER TRAVERSAL");
        tree.postOrder(root);
        
    }
    
    /*OUTPUT
    ---------------
    Node of tree : 1
    PREORDER TRAVERSAL
    1
    2
    4
    5
    3
    6
    INORDER TRAVERSAL
    4
    2
    5
    1
    3
    6
    POSTORDER TRAVERSAL
    4
    5
    2
    6
    3
    1
    */
    
}

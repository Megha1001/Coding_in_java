class BinaryTreePreOrder {
    
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
    }
    
    
    public static void main(String[] args) {
        //Pre-order traversal - NLR(Node, Left, Right)
        int nodes[] = {1, 2, 4, -1, -1, 5, -1,-1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Node of tree : "+ root.data);
        System.out.println("PREORDER TRAVERSAL");
        tree.preOrder(root);
        
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
    6*/
    
}

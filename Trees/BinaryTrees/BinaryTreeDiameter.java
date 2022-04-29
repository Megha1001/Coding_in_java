import java.util.*;

class BinaryTreeDiameter{
    
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    
    static class BinaryTree{
        public static int idx = -1;
        public static Node buildTree(int [] nodes){
            idx++;
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
            
            int leftSubTreeht = height(root.left);
            int rightSubTreeht  = height(root.right);
            
            int maxHeightParent = Math.max(leftSubTreeht, rightSubTreeht) +1;
            return maxHeightParent;
        }
        
        // APPROACH 1 : Time Complexity - O(N^2)
        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int maxHeighLeftSubTree = diameter(root.left);
            int maxHeighRightSubTree = diameter(root.right);
            int heightViaRoot = height(root.left) + height(root.right) +1;
            
            return Math.max(heightViaRoot, Math.max(maxHeighLeftSubTree, maxHeighRightSubTree));
        }
        
        // APPROACH 2 : Time Complexity - O(N)
        
        static class TreeInfo{
            int height;
            int diam;
            
            TreeInfo(int height, int diam){
                this.height = height;
                this.diam = diam;
            }
        }
        
        public static TreeInfo diameter2(Node root){
            if(root == null){
                return new TreeInfo(0,0);
            }
            
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);
            
            int myHeight = Math.max(left.height, right.height) +1;
            
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.height + right.height +1;
            int mydiam = Math.max(Math.max(diam1, diam2), diam3);
            
            return new TreeInfo(myHeight, mydiam);
            
        }
    }
    
    
    public static void main(String [] args){
        
        int nodes [] = {1, 2, 4, -1, -1, 5, -1,-1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Root Node of tree : "+ root.data);
        System.out.println("Height Of Tree : " +tree.height(root));
        System.out.println("Diameter Of Tree O(N^2) : " +tree.diameter(root));
        System.out.println("Diameter Of Tree O(N): " +tree.diameter2(root).diam);
    }
    
    
    /*
    OUTPUT
    --------------
    Root Node of tree : 1
    Height Of Tree : 3
    Diameter Of Tree O(N^2) : 5
    Diameter Of Tree O(N): 5
    */
    
}

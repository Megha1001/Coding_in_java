class CheckBalancedBTRecursiveEfficient{
  static class Node{
    int key;
    Node left;
    Node right;
    
    Node(int key){
      this.key = key;
    }
  }
  
  public static void main(String[] args){
    Node root = new Node(18);
    root.right = new Node(20);
    root.right.left = new Node(13);
    root.right.right = new Node (10);
    
    System.out.println("is this tree is balanced : ");
    
    if(checkBalancedBT(root) > -1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
 }
  
 //logic : if it's not balanced then it will return -1 otherwise it will return height of the tree
 public int boolean checkBalancedBT(Node root){
   if(root == null) return 0;
   int lh = checkBalancedBT(root.left);
   if(lh == -1)
     return -1;
   int rh = checkBalancedBT(root.right);
   if(rh == -1)
     return -1;
   if (Math.abs(lh - rh) >1) return -1;
   else 
     return Math.max(lh, rh) +1;
   
 }
}

class CheckBalancedBTRecursive{
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
    
    System.out.println("is this tree is balanced : "+checkBalancedBT(root));
 }
  
 public static boolean checkBalancedBT(Node root){
  if(root == null) return true;
  int lh = height(root.left);
  int rh = height(root.right);
   
  return Math.abs(lh - rh) <=1 && checkBalancedBT(root.left) && checkBalancedBT(root.right);
 }
  
  public static int height(Node root){
    if(root == null) return 0;
    else
        return Math.max(height(root.left), height(root.right)) + 1;
  }
}

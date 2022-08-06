import java.util.*;


class CalculateMaxWidthOfBT{
  
  public static int res = 0;
  
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
    
    System.out.println("is this tree is balanced : "+calMaxWidth(root));
 }

  public static int calMaxWidth(Node root){
    if(root == null) return 0;
    
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    res = 1;
    while(!q.isEmpty()){
      int count = q.size();
      if(count > res) res = count;
      for(int i = 0; i < count; i++){
        Node curr = q.poll();
        if(curr.left != null) q.add(curr.left);
        if(curr.right != null) q.add(curr.right);
      }
    }
    return res;
  }
  
}

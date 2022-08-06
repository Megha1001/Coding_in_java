import java.util.*;

class MaximumValueInTree{
   static class Node{
		int key;
		Node left;
		Node right;

		Node(int key){
			this.key = key;
			this.left = null;
			this.right = null;
		}

}
	static int value = Integer.MIN_VALUE;
	public static void main(String [] args){
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right  = new Node(50);

		System.out.println("Maximum value in given tree is  "+findMax(root));
}

public static int findMax(Node root){
		if(root == null) return value;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()){
			Node curr = q.poll();
			if(curr.key > value) value = curr.key;
			if(curr.left != null){
				q.add(curr.left);
      }
     if(curr.right != null){
				q.add(curr.right);
      }
  }
	return value;
  }
}



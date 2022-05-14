import java.util.LinkedList;
import java.util.Queue;

public class MaxValueIterative {
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
		static int max = Integer.MIN_VALUE;
    // Time complexity : O(n)
    //Auxiliary space :   θ(width), O(n) --for perfectly balanced tree
		public static int levelOrderTrav(Node root) {
			if(root==null) return max;
	        Queue<Node> q=new LinkedList<>();
	        q.add(root);
	        if(root.data > max) max = root.data;
	        while(q.isEmpty()==false){
	            Node curr = q.remove();
	            if(curr.data > max) max = curr.data;
	            if(curr.left!=null)
	                q.add(curr.left);
	            if(curr.right!=null)
	                q.add(curr.right);
	        }
	        return max;
		}
	
	}
	public static void main(String[] args) {
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
		
		System.out.println("Max value : "+BinaryTree.levelOrderTrav(root));
  }
}



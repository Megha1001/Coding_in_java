package trees;


/*Approach : do level order traversal by intersecting null after every level and maintain two variables (one is static max
 * and other is dynamic for each level count
 * 2. if curr == null -> level is traversed and compare count and max , and make count = 0;
 * 		else --> ++ count;
 * */
import java.util.*;

public class MaxWidthOfTreeThLevelOrderTrav {
	
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
		
		public static int max = 0;
		
		public static int calMaxWidth(Node root) {
			if(root == null) return 0;
			Queue<Node> q= new LinkedList<Node>();
			q.add(root);
			q.add(null);
			int count = 0;
			while(!q.isEmpty()) {
				Node curr = q.poll();
				if(curr != null) {
					++count;
					if(curr.left != null) q.add(curr.left);
					if(curr.right != null) q.add(curr.right);
				}else {
					if(max < count) max = count;
					count = 0;
					if(!q.isEmpty()) {
						q.add(null);
					}else {
						break;
					}
				}
			}
			
			return max;
		}
		
	}

	public static void main(String[] args) {
//		Node root = new Node(10);
//		root.left = new Node(20);
//		root.right = new Node(30);
//		root.left.left = new Node(40);
//		root.left.right = new Node(50);
//		root.left.left.left = new Node(70);
//		root.right = new Node(30);
//		root.right.right = new Node(60);
		
//		Node root = new Node(10);
//		root.left = new Node(80);
//		root.left.right = new Node(40);
		
//		Node root = new Node(10);
//		root.left = new Node(20);
//		root.right = new Node(30);
//		root.left.left = new Node(40);
//		root.left.right = new Node(50);
//		root.right.left = new Node(40);
//		root.right.right = new Node(60);
		
		Node root = null;
		
		System.out.println("Maximum width of tree  : "+BinaryTree.calMaxWidth(root));
		
	}

}

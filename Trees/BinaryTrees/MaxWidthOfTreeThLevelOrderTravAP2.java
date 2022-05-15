package trees;

import java.util.LinkedList;
import java.util.Queue;


public class MaxWidthOfTreeThLevelOrderTravAP2 {
	
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
			while(q.size() > 1) {
				Node curr = q.poll();
				
				if(curr == null) {
					max = max < count ? count : max;
					count = 0;
					q.add(null);
					continue;
				}
				
				++count;
				System.out.println("curr "+curr.data);
				if(curr.left != null) q.add(curr.left);
				if(curr.right != null) q.add(curr.right);
				System.out.println("max :"+max);
				System.out.println("count :"+count);
			}
			max = max < count ? count : max; 
			/*
			 * when queue only contains null at that time if that level has highest width
			 * will be neglected due to while condition , hence need to put this here
			 */
			return max;
		}
		
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.left.left = new Node(70);
		root.right = new Node(30);
		root.right.right = new Node(60);
		
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
		
//		Node root = null;
		
		System.out.println("Maximum width of tree  : "+BinaryTree.calMaxWidth(root));
		
	}

}

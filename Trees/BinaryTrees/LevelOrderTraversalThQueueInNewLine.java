package trees;

import java.util.*;

public class LevelOrderTraversalThQueueInNewLine {
	
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
		
		// Approach -1
		//Time complexity : O(n +h)
		//Auxilary space : θ(width) -- we have one level node + null(not count in asymptotic notation) or O(n) --> for perfect binary tree
		/*
		public static void printLevelOrderTrav(Node root) {
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node curr = q.remove();
				if(curr != null) {
					System.out.print(curr.data+" ");
					if(curr.left != null) {
						q.add(curr.left);
					}
					if(curr.right != null) {
						q.add(curr.right);
					}
				}else {
					System.out.println();
					if(!q.isEmpty()) {
						q.add(null);
					}else {
						break;
					}
					
				}
			}
		}
		*/
		
		// Approach - 2
		//Time complexity : O(n +h)
		//Auxilary space : θ(width)
		/*
		public static void printLevelOrderTrav(Node root) {
			Queue<Node> q = new LinkedList<Node>();
			
			q.add(root);
			q.add(null);
			
			while(q.size() > 1) {
				Node curr = q.poll();
				if(curr == null) {
					System.out.println();
					q.add(null);
					continue;
				}
					
				System.out.print(curr.data +" ");
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		*/
		
		// Approach - 3
		//Time complexity : O(n +h)
		//Auxilary space : θ(width) -- we have one level node + null(not count in asymptotic notation) or O(n) --> for perfect binary tree
		public static void printLevelOrderTrav(Node root) {
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			while(!q.isEmpty()) {
				int count = q.size();
				for(int i = 0; i < count ; i++) { // count should be used here otherwise if we use q.size() --> it is changing in the function
					Node curr = q.poll();
					System.out.print(curr.data + " ");
					if(curr.left != null) {
						q.add(curr.left);
					}
					if(curr.right != null) {
						q.add(curr.right);
					}
				}
				System.out.println();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(20);
		node.left.left = new Node(40);
		node.right = new Node(30);
		
		BinaryTree.printLevelOrderTrav(node);
	}

}

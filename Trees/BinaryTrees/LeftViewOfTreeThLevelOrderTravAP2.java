import java.util.*;

public class LeftViewOfTreeThLevelOrderTravAP2 {
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
		
		//Time complexity : O(n), auxiliary space : θ(width) -- we have one level node + null(not count in asymptotic notation) or O(n) --> for perfect binary tree
		public static void printLeftView(Node node) {
			if(node == null) {
				return ;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(node);
			
			while(!q.isEmpty()) {
				int count = q.size();
				for(int i = 0; i < count ; i++) {
					Node curr = q.poll();
					if(i == 0) {
						System.out.println(curr.data+" ");
					}
					if(curr.left != null) {
						q.add(curr.left);
					}
					if(curr.right != null) {
						q.add(curr.right);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left = new Node(20);
    	root.right=new Node(30);
    	root.right.left = new Node(40);
    	root.right.right = new Node(50);
		
		BinaryTree.printLeftView(root);
	}

}

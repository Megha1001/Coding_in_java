import java.util.*;

public class NumberOfNodesIterative {

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
		static int count = 0;
		public static int countNodes(Node root) {
			Queue<Node> q = new LinkedList<Node>();
			if(root == null) {
				return 0;
			}
			q.add(root);
			while(!q.isEmpty()) {
				count++;
				Node curr = q.poll();
				if(curr != null) {
					if(curr.left != null) q.add(curr.left);
					if(curr.right != null) q.add(curr.right);
				}
			}
			return count;
		}
	}
	
	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(20);
		node.left.left = new Node(40);
		node.right = new Node(30);
		
		System.out.println("Number of Nodes : "+BinaryTree.countNodes(node));

	}

}

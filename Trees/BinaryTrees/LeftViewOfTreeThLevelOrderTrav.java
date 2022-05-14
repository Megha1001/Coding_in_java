import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfTreeThLevelOrderTrav {
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
		
		public static void printLeftView(Node root) {
			Queue<Node> q = new LinkedList<Node>();
			if(root == null) {
				return ;
			}
			q.add(root);
			q.add(null);
			System.out.println(root.data);
			while(!q.isEmpty()) {
				Node curr = q.poll();
				if(curr == null) {
					if(!q.isEmpty()) {
						q.add(null);
						Node newCurr = q.poll();
						System.out.println(newCurr.data);
						if(newCurr.left != null) q.add(newCurr.left);
						if(newCurr.right != null) q.add(newCurr.right);
					}else {
						break;
					}
				}else {
					if(curr.left != null) q.add(curr.left);
					if(curr.right != null) q.add(curr.right);
				}
			}
		}
	
	}
	public static void main(String[] args) {
		Node root=new Node(30);
    	root.right=new Node(50);
    	root.right.left = new Node(60);
    	root.right.left.right = new Node(10);
		
		BinaryTree.printLeftView(root);
	}

}

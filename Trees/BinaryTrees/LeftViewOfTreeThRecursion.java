/*Logic : Do pre-order traversal , since during pre-order traversal we visit leftmost node of each level at first*/

public class LeftViewOfTreeThRecursion {
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
		public static int maxLevel = 0; // maintain the visited/discovered level
		public static void printLeftView(Node root, int level) {
			if(root == null) return;
			if(maxLevel < level) {
				System.out.print(root.data +" ");
				maxLevel = level;
			}
			printLeftView(root.left, level + 1);
			printLeftView(root.right, level + 1);
		}
	
	}
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left = new Node(20);
    	root.right=new Node(530);
    	root.right.left = new Node(40);
    	root.right.right = new Node(50);
		
		BinaryTree.printLeftView(root, 1);
	}



}

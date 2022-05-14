public class CheckSumProperty {
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
	
		// Time complexity : O(n), auxiliary space : O(height)
		public static boolean checkChildrenSumProp(Node root) {
			if(root == null || (root.left == null && root.right == null)) return true; // second condition is important for checking leaf nodes
			int temp = 0;
			if(root.left != null) {
				temp += root.left.data;
			}
			if(root.right != null) {
				temp += root.right.data;
			}
			if(root.data != temp) {
				return false;
			}
			return checkChildrenSumProp(root.left) && checkChildrenSumProp(root.right);
		}
	}
	public static void main(String[] args) {
		Node root=new Node(20);
		root.left = new Node(8);
    	root.right=new Node(12);
    	root.left.left = new Node(3);
    	root.left.right = new Node(5);
    	
    	Node root1 = new Node(10);
    	root1.left = new Node(8);
    	root1.right = new Node(2);
    	root1.right.left = new Node(2);
    	
    	Node root2 = new Node(3);
    	root2.left = new Node(1);
    	root2.right = new Node(2);
    	root2.right.left = new Node(1);
    	root2.right.right = new Node(2);
		
		System.out.println(BinaryTree.checkChildrenSumProp(root));
		System.out.println(BinaryTree.checkChildrenSumProp(root1));
		System.out.println(BinaryTree.checkChildrenSumProp(root2));
		System.out.println(BinaryTree.checkChildrenSumProp(new Node(5)));
		System.out.println(BinaryTree.checkChildrenSumProp(null));
	}

}

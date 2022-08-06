import java.util.*;



class LeftViewOfTreeUsingLOT{
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

	public static void main(String [] args){
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right  = new Node(50);

		System.out.println("Left view of given tree is :  ");
		printLeftView(root);
}

public static void printLeftView(Node root){
		if(root == null) return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()){
			int count = q.size();
			
			for(int i = 0; i < count; i++){
			    Node curr = q.poll();
				if(i == 0) System.out.print(curr.key+" ");
				if(curr.left != null) q.add(curr.left);
				if(curr.right != null) q.add(curr.right);
}
}
}
}



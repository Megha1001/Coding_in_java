import java.util.*;

class CheckChildSumProperty{

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

	public static void main(String[] args){
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(12);
		root.left.left = new Node(3);
		root.left.right = new Node(5);

		System.out.println(" Child sum property exist ? :"+checkChildSumProperty(root));
}

public static String checkChildSumProperty(Node root){
	if(root == null) return "YES";
	Queue<Node>q = new LinkedList<Node>();
	q.add(root);
	while(!q.isEmpty()){
		Node curr = q.poll();
		int sum  = 0;
		boolean flag = true;

		if(curr.left != null) {
			q.add(curr.left);
			sum += curr.left.key;
			flag = false;
}

if(curr.right != null){
	q.add(curr.right);
	sum += curr.right.key;
	flag = false;
}


if(curr.key != sum && !flag){
	return "NO";
}
}

return "YES";
}

}

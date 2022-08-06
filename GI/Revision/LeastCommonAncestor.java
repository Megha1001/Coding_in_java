//Question : https://practice.geeksforgeeks.org/batch-problems/lowest-common-ancestor-in-a-binary-tree/0/?track=DSASP-Tree&batchId=154#

class Solution
{
    ArrayList<Node> path1 = new ArrayList<Node>();
    ArrayList<Node> path2 = new ArrayList<Node>();
    
	Node lca(Node root, int n1,int n2)
	{
	    if(findPath(root, path1, n1) == false ||findPath(root, path2, n2) == false){
	        return null;
	    }	
	    
	    // exists
	    int i;
	    for(i =0; i < path1.size() && i < path2.size() ;i++){
	        if(!path1.get(i).equals(path2.get(i))){
	            break;
	        }
	    }
	    
	    return path1.get(i-1);
	}

    public  static boolean findPath(Node root, ArrayList<Node> path, int n){
        if(root == null){
            return false;
        }
        
        path.add(root);
        
        if(root.data == n){
            return true;
        }
        
        if((root.left!= null && findPath(root.left, path, n))|| (root.right != null &&findPath(root.right, path, n))){
            return true;
        }
        
        path.remove(path.size()-1);
        return false;
    }

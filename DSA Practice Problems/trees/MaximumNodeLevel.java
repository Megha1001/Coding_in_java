// Run at: https://practice.geeksforgeeks.org/problems/maximum-node-level/1/

class Tree
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
       if(root == null){
           return 0;
       }
       
       Queue<Node> q = new LinkedList<Node>();
       q.add(root);
       
       int ctr = 0;
       int level = 0;
       int templevel =0;
       while(!q.isEmpty()){
           int count = q.size();
           int tempIdx = 0;
            ++templevel;
           for(int i = 0 ; i < count ; i++){
               Node curr = q.poll();
               ++ tempIdx;
               if(curr.left != null) q.add(curr.left);
               if(curr.right != null) q.add(curr.right);
           }
           
           if(ctr < tempIdx) {
               ctr = tempIdx;
               level = templevel;
           }
       }
       return level - 1;
    }
}

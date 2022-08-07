class ConnectNodesAtSameLevel
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        if(root == null){
            return;
        }
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node p = q.peek();
            q.remove();
            
            if(p != null){
                
                p.nextRight = q.peek();
                
                if(p.left != null) q.add(p.left);
                if(p.right != null) q.add(p.right);
            }
            else if(!q.isEmpty()){
                q.add(null);
            }

        }
        
    }
}

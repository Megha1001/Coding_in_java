//Question Link :https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Graph/problem/bfs-traversal-of-graph

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean []visited = new boolean[V];
        Queue<Integer> q = new LinkedList<Integer>();
        visited[0] = true;
        q.add(0);
        
        while(!q.isEmpty()){
            int u = q.poll();
            result.add(u);
            for(int v : adj.get(u)){
                if(!visited[v]){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        
        return result;
    }
}

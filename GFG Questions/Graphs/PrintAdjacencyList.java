class PrintAdjacencyList {
    // Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> adj) {
     
        ArrayList<ArrayList<Integer>> adjClone = new  ArrayList<ArrayList<Integer>>(V);
        for(int i = 0 ; i < V; i++){
            adjClone.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < adj.size(); i++){
            adjClone.get(i).add(i);
            for(int j = 0 ; j < adj.get(i).size(); j++){
                adjClone.get(i).add(adj.get(i).get(j));
            }
        }
        
        return adjClone;
    }
    
    // public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    //     // Code here
    //     ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
    //     for(int i=0;i<V;i++){
    //         ArrayList<Integer> comp=new ArrayList<>();
    //         comp.add(i);
    //         for(int j=0;j<adj.get(i).size();j++){
    //             comp.add(adj.get(i).get(j));
    //         }
    //         ans.add(comp);
    //     }
    //     return ans;
    // }
    
    
//     public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//       // Code here
//       ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
//       for(int i=0;i<V;i++){
//           ans.add(new ArrayList<Integer>());
//       }
//       for(int i=0;i<V;i++){
//           ans.get(i).add(i);
//           for(int it:adj.get(i)){
//               ans.get(i).add(it);
//           }
//       }
//       return ans;
//   }
  
  /*
0-> 1-> 4
1-> 0-> 2-> 3-> 4
2-> 1-> 3
3-> 1-> 2-> 4
4-> 0-> 1-> 3
  */

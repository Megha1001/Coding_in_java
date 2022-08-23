import java.util.*;

/*
Concept : When we see an edge from one of the decendents to any of the ancestors in recursion tree, then we say there is a cycle
Time Complexity : O(V+E)
*/

class DetectCycleInDirectedGraphDFS{
		public static void main(String []args){
		    int v = 6;
		    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
		    
		    for(int i = 0; i < v; i++){
		        adj.add(new ArrayList<Integer>());
		    }
		    
		    addAnEdge(adj,0,1);
		    addAnEdge(adj,2,1);
		    addAnEdge(adj,2,3);
		    addAnEdge(adj,3,4);
		    addAnEdge(adj,4,5);
		    addAnEdge(adj,5,3);
		    
		    System.out.println("Given directed graph adj list representation is :");
		    printGraph(adj);
		    
		    System.out.println("is there any cycle in directed graph ? :"+detectCycle(adj, v));
		}	
		
	static	boolean detectCycle(ArrayList<ArrayList<Integer>> adj, int v){
		    
		    boolean [] visited = new boolean[v];
		    boolean [] recStack = new boolean[v];
		    
		    for(int i=0;i<v;i++){
		        if(!visited[i]){
		            if(DFSRec(adj,i,visited,recStack)==true)
                     return true;
		        }
		    }
		    return false;
		}
		
		static boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, boolean[]recStack){
		    
		    visited[i] = true;
		    recStack[i] = true;
		    
		    for(int u : adj.get(i)){
		        if(!visited[u]){
		            return DFSRec(adj, u, visited, recStack);
		        }else if(recStack[u] == true){
		            return true;
		        }
		    }
		    
		    return false;
		}
		static void addAnEdge(ArrayList<ArrayList<Integer>>adj, int u,int v){
		    adj.get(u).add(v);
		    
		}
		
		static void printGraph(ArrayList<ArrayList<Integer>>adj){
		    for(int i = 0; i < adj.size(); i++){
		        for(int j = 0; j< adj.get(i).size(); j++){
		            System.out.print(adj.get(i).get(j)+" ");
		        }
		        System.out.println();
		    }
		}

}

/*
Given directed graph adj list representation is :
1 

1 3 
4 
5 
3 
is there any cycle in directed graph ? :true
*/

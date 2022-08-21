// Detect cycle in undirected graph by BFS
/*
LOGIC : Maintain a parent array list  , during traversing of adjacency list if node is not visited set the parent of node in the list, else if visited
check the parent of node != current node in adjacency list.
*/

import java.util.*;

class DetectCycleByBFSInUndirectedGraph {
    public static void main(String[] args) {
        int v = 6;
        ArrayList < ArrayList < Integer >> adj = new ArrayList < ArrayList < Integer >> (v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList < Integer > ());
        }

        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 1, 2);
        addAnEdge(adj, 1, 3);
        addAnEdge(adj, 2, 3);
        addAnEdge(adj, 2, 4);
        addAnEdge(adj, 4, 5);

        System.out.println("Given adjacency list of graph is :");
        printGraph(adj);
        System.out.println("is Given graph contains cycle ? " + detectCycle(adj, v));


    }

    static boolean detectCycle(ArrayList < ArrayList < Integer >> adj, int v) {
        ArrayList < Integer > parent = new ArrayList < Integer > (v);

        //initialize with -1 value indicate there is no parent
        for (int i = 0; i < v; i++) {
            parent.add(i, -1);
        }

        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                return BFSTrav(adj, i, parent, visited);
            }
        }


        for (int i = 0; i < parent.size(); i++) {
            System.out.println(i + ":" + parent.get(i));
        }
        return false;
    }

    static boolean BFSTrav(ArrayList < ArrayList < Integer >> adj, int s, ArrayList < Integer > parent,
        boolean[] visited) {

        Queue < Integer > q = new LinkedList < Integer > ();
        q.add(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v: adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    parent.set(v, u);
                    q.add(v);
                } else if (v != parent.get(u)) {
                    return true;
                }
            }
        }
        return false;
    }

    static void addAnEdge(ArrayList < ArrayList < Integer >> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList < ArrayList < Integer >> adj) {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}

/*
Given adjacency list of graph is :
1 
0 2 3 
1 3 4 
1 2 
2 5 
4 
is Given graph contains cycle ? true
*/

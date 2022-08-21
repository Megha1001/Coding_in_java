import java.util.*;

/*
--> Recursive in nature
How to traverse
  -->Begin wiht source vertex and then we pick adjacent of it and then we recursiveley call for that adjacent and we print all the veritces reachable from that adjacent
  and then we print all the vertices reachable from that adjacent.Once that adjacenat and its reachable are finished. then we recursively call for the 
  other adjacent of the current source
 */

class DFSConnectedAndSourceGiven {

    public static void main(String[] args) {
        int v = 5;
        ArrayList < ArrayList < Integer >> adj = new ArrayList < ArrayList < Integer >> (v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList < Integer > ());
        }

        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 0, 2);
        addAnEdge(adj, 1, 3);
        addAnEdge(adj, 1, 4);
        addAnEdge(adj, 2, 3);
        addAnEdge(adj, 3, 4);

        System.out.println("Given adjancency list of graph is :");
        printGraph(adj);
        int source = 0;
        System.out.println("DFS traversal for connected and source given graph is ");
        DFSGivenSourceAndConnGraph(adj, source, v);
    }

    static void DFSGivenSourceAndConnGraph(ArrayList < ArrayList < Integer >> adj, int s, int v) {
        boolean[] visited = new boolean[v];
        BFSRec(adj, s, visited);

    }

    static void BFSRec(ArrayList < ArrayList < Integer >> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");

        for (int u: adj.get(s)) {
            if (!visited[u]) {
                BFSRec(adj, u, visited);
            }
        }
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

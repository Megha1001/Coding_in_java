import java.util.*;

class DFSDisconnected {

    public static void main(String[] args) {
        int v = 5;

        ArrayList < ArrayList < Integer >> adj = new ArrayList < ArrayList < Integer >> (v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList < Integer > ());
        }

        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 2, 3);
        addAnEdge(adj, 2, 4);

        System.out.println("Given adjacency list of graph is :");
        printGraph(adj);
        System.out.println("DFS of disconnected graph is :");
        DFSDisc(adj, v);
    }

    static void DFSDisc(ArrayList < ArrayList < Integer >> adj, int v) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                DFSRec(adj, i, visited);
            }
        }
    }

    static void DFSRec(ArrayList < ArrayList < Integer >> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int u: adj.get(s)) {
            if (!visited[u]) {
                DFSRec(adj, u, visited);
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



/*
Given adjacency list of graph is :
1 
0 
3 4 
2 
2 
DFS of disconnected graph is :
0 1 2 3 4 
*/

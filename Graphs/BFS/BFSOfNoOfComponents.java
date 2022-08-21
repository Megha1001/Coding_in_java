import java.util.*;

class BFSOfNoOfConnComponents {
    public static void main(String[] args) {
        int v = 7;
        ArrayList < ArrayList < Integer >> adj = new ArrayList < ArrayList < Integer >> (v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList < Integer > ());
        }

        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 1, 3);
        addAnEdge(adj, 0, 2);
        addAnEdge(adj, 2, 3);
        addAnEdge(adj, 4, 5);
        addAnEdge(adj, 4, 6);

        System.out.println("Given graph is : ");
        printGraph(adj);
        System.out.println("No of connected components are : "+BFSDis(adj, v));
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

    static int BFSDis(ArrayList < ArrayList < Integer >> adj, int v) {
        boolean[] visited = new boolean[v];
        int count = 0;
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                ++count; // this condition will be true only when we traverse/discover first node of disconnected compenent
                BFS(adj, i, visited);
            }
        }
        return count;
    }

    static void BFS(ArrayList < ArrayList < Integer >> adj, int s, boolean[] visited) {
        Queue < Integer > q = new LinkedList < Integer > ();

        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            //System.out.print(u + " ");
            for (int v: adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

}

/*
Given graph is : 
1 2 0 3 
0 3 
1 2 
5 6 
4 
4 
No of connected components are : 2
*/

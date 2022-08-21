import java.util.*;

class AdjecencyListBFSSourceIsGiven {
    public static int v = 5;
    public static void main(String[] args) {

        // create an adjacency list
        ArrayList < ArrayList < Integer >> adj = new ArrayList < ArrayList < Integer >> (v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList < Integer > ());
        }
        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 0, 2);
        addAnEdge(adj, 1, 2);
        addAnEdge(adj, 1, 3);
        addAnEdge(adj, 2, 3);
        addAnEdge(adj, 2, 4);
        addAnEdge(adj, 3, 4);

        System.out.println("Given graph is : ");
        printGraph(adj);

        System.out.println("BFS traversal is  : ");
        //BFS traversal when source vertex is given
        int source = 0;
        BFSSourceGiven(adj, source);
    }

    static void BFSSourceGiven(ArrayList < ArrayList < Integer >> adj, int s) {
        boolean[] visited = new boolean[v];
        Queue < Integer > q = new LinkedList < Integer > ();
        visited[s] = true; // this means vertex is discovered and has been added to the queue it doesnot mean that it’s printed on the screen.
        q.add(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v: adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
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

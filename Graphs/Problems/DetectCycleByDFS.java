import java.util.*;

class DetectCycleByDFS {
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
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                // called for first node of every non-visted component in that case parent should be -1
                if (DFSRec(adj, i, visited, -1)) {
                    return true;
                }
            }
        }

        return false;

    }

    static boolean DFSRec(ArrayList < ArrayList < Integer >> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;

        for (int v: adj.get(s)) {
            if (!visited[v]) {
                if (DFSRec(adj, v, visited, s)) {
                    return true;
                }
            } else if (v != parent) {
                return true;
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

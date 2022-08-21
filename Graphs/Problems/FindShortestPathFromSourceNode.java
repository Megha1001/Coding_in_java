import java.util.*;

class FindShortestPathFromSourceNode {

    public static void main(String[] args) {
        int v = 4;

        ArrayList < ArrayList < Integer >> adj = new ArrayList < ArrayList < Integer >> (v);

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList < Integer > ());
        }

        addAnEdge(adj, 0, 1);
        addAnEdge(adj, 0, 2);
        addAnEdge(adj, 1, 2);
        addAnEdge(adj, 1, 3);
        addAnEdge(adj, 2, 3);

        System.out.println("Given adjacency list of graph is :");
        printGraph(adj);
        int source = 0;
        System.out.println("Shortest path from all the nodes are :");
        findShortestPath(adj, v, source);

    }

    static void findShortestPath(ArrayList < ArrayList < Integer >> adj, int v, int s) {

        int[] dist = new int[v];

        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[s] = 0;

        boolean[] visited = new boolean[v];

        Queue < Integer > q = new LinkedList < Integer > ();
        q.add(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int w: adj.get(u)) {
                if (!visited[w]) {
                    dist[w] = dist[u] + 1;
                    visited[w] = true;
                    q.add(w);
                }
            }

        }

        printShortestPath(dist);

    }


    static void printShortestPath(int[] dist) {
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ,");
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
Given adjacency list of graph is :1 2 
0 2 3 
0 1 3 
1 2 
Shortest path from all the nodes are :
0 ,1 ,1 ,2 ,
*/

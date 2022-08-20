import java.util.*;

/*
Size : Undirected graph : Θ(V+2E) --> every edge contributes to two cells
Time Complexity : 
        -Check if there is an edge from u to v : O(V)
        -Find all adjacent of u : Θ(degree(U));
        -Find degree of u : Θ(1)
        -Add an edge :  Θ(1) --> can be done by using add function
        -Remove an edge :  O(V)
*/


class AdjecencyList {
    public static void main(String[] args) {
        int v = 5;
        
        /* Reason of not using Array of ArrayList : that always gives warning or error in java : unchecked conversion. So only option to use 
          - ArrayList of ArrayList; --> cache friendly
          - ArrayList of LinkedList;
        */
        ArrayList < ArrayList < Integer >> adj = new ArrayList < ArrayList < Integer >> (v);
        System.out.println(adj.size()); //0

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList < Integer > ());
        }
        System.out.println(adj.size()); //5

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 1);

        printGraph(adj);
    }

    static void addEdge(ArrayList < ArrayList < Integer >> adj, int u, int v) {
        //for undirected graph
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

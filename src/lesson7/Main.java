package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(4, 7);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);
        graph.addEdge(8, 9);


//        System.out.println(graph.getAdjList(2));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(4));
////        System.out.println(dfp.hasPathTo(7));
//        System.out.println(dfp.pathTo(4));

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(4));
        System.out.println(bfp.pathTo(9));
    }
}

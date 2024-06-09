public class GraphMain {
        public static void main(String[] args) {
            Graph g = new Graph(10);
    
            g.addEdge(0,1,4);
            g.addEdge(0,2,5);
            g.addEdge(1,2,7);
            g.addEdge(2,0,3);
            g.addEdge(2,3,6);
            g.addEdge(6, 8,2);
            
            
            g.print();
            g.getDegree();

            g.getEdge(1, 4);
        }
    }


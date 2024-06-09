public class Graph {

    public int numVertices;
    public int [][] adjMatrix;

    public Graph (int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new int [numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjMatrix[i][j] = 0; // Atau Double.POSITIVE_INFINITY;
            }
        }
    }

    public void addEdge(int i, int j, int weight) {
        if(i >= 0 && i < numVertices && j >= 0 && j < numVertices){
            adjMatrix[i][j] = weight;
            adjMatrix[j][i] = weight;
        } else{
            System.out.println("Error Node "+ i + " atau "+ j +" diluar batas");
        }
    }
    
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;

    }
    public void getEdge(int i, int j) {
        boolean hasEdge = adjMatrix[i][j] != 0;
        if (hasEdge) {
            System.out.println("Terdapat edge antara vertex " + i + " dan vertex " + j);
        } else {
            System.out.println("Tidak terdapat edge antara vertex " + i + " dan vertex " + j);
        }
    }
    public void getDegree(){
        for(int vertex=0;vertex < numVertices; vertex++){
            int degree = 0;

            for (int j=0;j < numVertices; j++){
                if (adjMatrix[vertex][j] != 0) {
                    degree++;
                }
            }
            System.out.println("Jumlah edge di vertex "+ vertex +" : "+ degree);
        }
    }

    public void print() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " : ");
            
            for (int j : adjMatrix[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        
    }
}
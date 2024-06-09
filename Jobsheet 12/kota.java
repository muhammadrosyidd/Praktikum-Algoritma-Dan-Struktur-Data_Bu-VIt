public class kota {
        private String[] vertices;
        private int[][] adjMatrix;
        private int numVertices;
    
        // Constructor
        public kota(int numVertices) {
            this.numVertices = numVertices;
            vertices = new String[numVertices];
            adjMatrix = new int[numVertices][numVertices];
        }
    
        // menambah vertex
        public void addVertex(int index, String name) {
            vertices[index] = name;
        }
    
        // menambahkan edge
        public void addEdge(int index1, int index2, int weight) {
            adjMatrix[index1][index2] = weight;
            adjMatrix[index2][index1] = weight;
        }
    
        // mendapatkan indeks vertex berdasarkan nama
        public int getVertexIndex(String name) {
            for (int i = 0; i < numVertices; i++) {
                if (vertices[i].equalsIgnoreCase(name)) {
                    return i;
                }
            }
            return -1; 
        }
    
        
        public void printGraph() {
            for (int i = 0; i < numVertices; i++) {
                System.out.println(vertices[i] + ":");
                for (int j = 0; j < numVertices; j++) {
                    if (adjMatrix[i][j] > 0) {
                        System.out.println("  - Jarak ke " + vertices[j] + ": " + adjMatrix[i][j]+" km");
                    }
                }
            }
        }
    }


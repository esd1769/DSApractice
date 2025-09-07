public class Task3a {

    // function to find vertex with maximum degree and max sum of outgoing weights
    public static void analyzeDirectedMatrix(int[][] matrix) {
        int maxDegree = 0, vertexDegree = -1;
        int maxSum = 0, vertexSum = -1;

        for (int i = 0; i < matrix.length; i++) {
            int degree = 0;
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    degree++;      // count outgoing edges
                    sum += matrix[i][j]; // sum outgoing weights
                }
            }
            if (degree > maxDegree) { maxDegree = degree; vertexDegree = i; }
            if (sum > maxSum) { maxSum = sum; vertexSum = i; }
        }

        System.out.println("Vertex with max outgoing degree: " + vertexDegree + ", degree: " + maxDegree);
        System.out.println("Vertex with max outgoing sum: " + vertexSum + ", sum: " + maxSum);
    }

    public static void main(String[] args) {
        int vertices = 7; 
        int[][] adjMatrix = {
            {0,1,1,1,1,1,1},
            {1,0,1,1,1,1,1},
            {1,1,0,1,0,0,1},
            {1,1,1,0,1,0,0},
            {1,1,0,1,0,1,0},
            {1,1,0,0,1,0,1},
            {1,1,1,0,0,1,0}
        };

        analyzeDirectedMatrix(adjMatrix);
    }
}

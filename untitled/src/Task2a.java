public class Task2a {

    // function to find vertex with maximum sum of edge weights
    public static int maxWeightVertex(int[][] matrix) {
        int maxSum = 0;
        int vertex = -1;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                vertex = i;
            }
        }
        System.out.println("Maximum sum of edge weights: " + maxSum);
        return vertex;
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
        int vertex = maxWeightVertex(adjMatrix);
        System.out.println("Vertex with maximum sum: " + vertex);
    }
}

public class Task0a {
    public static void main(String[] args) {
        int[][] adjMatrix = {
            {0, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 0, 0, 1},
            {1, 1, 1, 0, 1, 0, 0},
            {1, 1, 0, 1, 0, 1, 0},
            {1, 1, 0, 0, 1, 0, 1},
            {1, 1, 1, 0, 0, 1, 0}
        };

        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

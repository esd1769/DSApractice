class Edge {
    int src, dst, weight;
    Edge next;

    Edge(int src, int dst) {
        this.src = src;
        this.dst = dst;
        this.weight = 1; // unweighted graph
    }
}

public class Task0b {
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


        Edge[] adjList = new Edge[vertices];
        Edge e1 = new Edge(1-1, 2-1);
        adjList[1-1]=e1;


        Edge e13 = new Edge(1-1, 3-1);
        e1.next=e13;
        Edge e2 = new Edge(1-1, 4-1);
        e13.next=e2;
        Edge e3 = new Edge(1-1, 5-1);
        e2.next=e3;
        Edge e4 = new Edge(1-1, 6-1);
        e3.next=e4;
        Edge e5 = new Edge(1-1, 7-1);


        Edge e6 = new Edge(2-1, 3-1);
        adjList[2-1]=e6;

        Edge e7 = new Edge(2-1, 4-1);
        e6.next=e7;
        Edge e8 = new Edge(2-1, 5-1);
        e7.next=e8;
        Edge e9 = new Edge(2-1, 6-1);
        e8.next=e9;
        Edge e10 = new Edge(2-1, 7-1);
        e9.next=e10;
        Edge e11 = new Edge(3-1, 4-1);
        adjList[3-1]=e11;
        Edge e12 = new Edge(3-1, 7-1);
        e11.next=e12;

        Edge e14 = new Edge(4-1, 5-1);
        adjList[4-1]=e14;
        Edge e15 = new Edge(5-1, 6-1);
        adjList[5-1]=e15;
        Edge e16 = new Edge(6-1, 7-1);
        adjList[6-1]=e16;


        Edge e17 = new Edge(2-1, 1-1);
        e10.next=e17;
        Edge e18 = new Edge(3-1, 1-1);
        e12.next=e18;
        Edge e19 = new Edge(4-1, 1-1);
        e14.next=e19;
        Edge e20 = new Edge(5-1, 1-1);
        e15.next=e20;
        Edge e21 = new Edge(6-1, 1-1);
        e16.next=e21;
        Edge e22 = new Edge(7-1, 1-1);
        adjList[7-1]=e22;
        Edge e23 = new Edge(3-1, 2-1);
        e18.next=e23;
        Edge e24 = new Edge(4-1, 2-1);
        e19.next=e24;
        Edge e25 = new Edge(5-1, 2-1);
        e20.next=e25;
        Edge e26 = new Edge(6-1, 2-1);
        e21.next=e26;
        Edge e27 = new Edge(7-1, 2-1);
        e22.next=e27;
        Edge e28 = new Edge(4-1, 3-1);
        e24.next=e28;
        Edge e29 = new Edge(7-1, 3-1);
        e27.next=e29;
        Edge e30 = new Edge(5-1, 4-1);
        e25.next=e30;
        Edge e31 = new Edge(6-1, 5-1);
        e26.next=e31;
        Edge e32 = new Edge(7-1, 6-1);
        e29.next=e32;

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            Edge temp = adjList[i];
            while (temp != null) {
                System.out.print(temp.dst + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

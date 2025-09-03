public class Ass3 

{
    public static int[] ass(int[] tasks, int m){
        MinHeap minHeap =new MinHeap(m);
        for (int i =1;i<= m;i++) 
        
        {
            minHeap.insert(0);
        }

        for (int i =0; i <tasks.length;i++) {
            int minLoad =minHeap.extractMin();
            minHeap.insert(minLoad+ tasks[i]);
        }

        int[] result =new int[m];
        for (int i =1; i<= m;i++)
        
        {
            result[i-1]= minHeap.extractMin();
        }
        return result;
    }

    public static void main(String[] args){
        int[] tasks = {2,4,7, 1,6};
        int m =4;
        int[] result= ass(tasks,m);

        int n = result.length;

        System.out.print("[");
        for (int i = 0; i < n; i++)
        {


            System.out.print(result[i]);
            if (i < n - 1) {
                System.out.print(", ");


            }

        }
        System.out.print("]");
    }
}

public class Ass4 {
    public static int[] find(int[] nums, int k) {
        MaxHeap maxHeap = new MaxHeap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            maxHeap.insert(nums[i]);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.extractMax();
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;
        int[] result = find(nums, k);
        System.out.print("[");

        int n = result.length;
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

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity + 1]; // Index starts from 1
        size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }
        heap[++size] = value; // Start from index 1
        swim(size);
    }

    private void swim(int index) {
        while (index > 1 && heap[index] > heap[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private int parent(int index) {
        return index / 2;
    }

    public int deleteMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[1];
        swap(1, size--);
        heapify(1);
        return max;
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[1];   // root is the maximum element
        swap(1, size);       // swap the root with the last element
        size--;              // decrease the size after swap
        sink(1);             // restore heap property by sinking the root
        return max;
    }
    private void heapify(int index) {
        int largest = index;
        int left = 2 * index;
        int right = 2 * index + 1;

        if (left <= size && heap[left] > heap[largest]) largest = left;
        if (right <= size && heap[right] > heap[largest]) largest = right;

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }
    private void sink(int index) {
        int largest = index;
        int left = 2 * index;
        int right = 2 * index + 1;

        // Check if the left child exists and is larger than the current largest
        if (left <= size && heap[left] > heap[largest]) largest = left;

        // Check if the right child exists and is larger than the current largest
        if (right <= size && heap[right] > heap[largest]) largest = right;

        // If the largest is not the current index, swap and continue sinking
        if (largest != index) {
            swap(index, largest);
            sink(largest);  // Recursively sink the swapped element
        }
    }


    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void heapSort() {
        int originalSize = size;
        for (int i = size; i > 1; i--) {
            swap(1, i);
            size--;
            heapify(1);
        }
        size = originalSize;
    }

    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(7);
        maxHeap.insert(30);
        maxHeap.insert(15);

        System.out.println("Heap:");
        maxHeap.printHeap();

        System.out.println("Deleted Max: " + maxHeap.deleteMax());

        System.out.println("Heap After Deletion:");
        maxHeap.printHeap();

        System.out.println("Heap Sort:");
        maxHeap.heapSort();
        maxHeap.printHeap();
    }
}

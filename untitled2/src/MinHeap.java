public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
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
        while (index > 1 && heap[index] < heap[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private int parent(int index) {
        return index / 2;
    }

    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap[1];
        swap(1, size--);
        sink(1);
        return min;
    }

    private void sink(int index) {
        int smallest = index;
        int left = 2 * index;
        int right = 2 * index + 1;

        if (left <= size && heap[left] < heap[smallest]) smallest = left;
        if (right <= size && heap[right] < heap[smallest]) smallest = right;

        if (smallest != index) {
            swap(index, smallest);
            sink(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void sort() {
        int originalSize = size;
        for (int i = size; i > 1; i--) {
            swap(1, i);
            size--;
            sink(1);
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
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(5);
        minHeap.insert(7);
        minHeap.insert(30);
        minHeap.insert(15);

        System.out.println("Min Heap:");
        minHeap.printHeap();

        System.out.println("Extract Min: " + minHeap.extractMin());

        System.out.println("Min Heap After Extraction:");
        minHeap.printHeap();

        System.out.println("Heap Sort:");
        minHeap.sort();
        minHeap.printHeap();
    }
}

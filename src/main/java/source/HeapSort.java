package source;

public class HeapSort {

    private int[] tree;
    private int heapSize;

    public HeapSort(int[] tree) {
        this.tree = tree;
        this.heapSize = tree.length;
    }

    private void maxHeapify(int index) {
        int left = findLeft(index);
        int right = findRight(index);
        int largest;
        if (left < heapSize && tree[index] < tree[left]) {
            largest = left;
        } else {
            largest = index;
        }
        if (right < heapSize && tree[largest] < tree[right]) {
            largest = right;
        }

        if (largest != index) {
            int temp = tree[index];
            tree[index] = tree[largest];
            tree[largest] = temp;

            maxHeapify(largest);
        }
    }

    private  void buildHeap() {
        for (int i = tree.length / 2; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    public void sort() {
        buildHeap();
        for (int i = tree.length - 1; i > 0; i--) {
            int temp = tree[i];
            tree[i] = tree[0];
            tree[0] = temp;
            heapSize--;
            maxHeapify( 0);
        }
    }

    private int findParent(int index) {
        return (index - 1) / 2;
    }

    private  int findLeft(int index) {
        return 2 * index + 1;
    }

    private int findRight(int index) {
        return 2 * index + 2;
    }
}

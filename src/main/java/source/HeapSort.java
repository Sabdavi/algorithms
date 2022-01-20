package source;

public class HeapSort {

    private int[] tree;
    private int heapSize;

    public HeapSort(int[] tree) {
        this.tree = tree;
        this.heapSize = 0;
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

    public int extract_max(){
        if(heapSize < 0 ){
            System.out.println("Under Fellow");
        }
        int max = tree[0];
        heapSize--;
        tree[0] = tree[heapSize];
        maxHeapify(0);
        return max;
    }

    public void printHeap(){
        for(int i = 0 ; i < heapSize ; i++){
            System.out.println(tree[i]);
        }
    }

    public void printTree(){
        for(int i = 0 ; i < tree.length ; i++){
            System.out.println(tree[i]);
        }
    }

    public void increaseKey(int i , int key){
        tree[i] = key;
        while(i > 0 && tree[findParent(i)] < tree[i]){
            int temp = tree[findParent(i)];
            tree[findParent(i)] = tree[i];
            tree[i] = temp;
            i = findParent(i);
        }
    }

    public void insert(int key){
        tree[heapSize] = Integer.MIN_VALUE;
        increaseKey(heapSize,key);
        heapSize++;

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

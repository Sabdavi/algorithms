package source;

public class InsertionSort {
    public static <T extends Comparable<T>> void sort(T[] toSort){
        for(int i = 1 ; i < toSort.length ; i++){
            T key =  toSort[i];
            int j = i-1;

            while(j >= 0 && toSort[j].compareTo(key) > 0  ){
                toSort[j+1] = toSort[j];
                j--;
            }
            toSort[j+1] = key;
        }
    }

    public static  void sort(int[] toSort){
        for(int i = 1 ; i < toSort.length ; i++){
            int key =  toSort[i];
            int j = i-1;

            while(j >= 0 && toSort[j] > key  ){
                toSort[j+1] = toSort[j];
                j--;
            }
            toSort[j+1] = key;
        }
    }
}

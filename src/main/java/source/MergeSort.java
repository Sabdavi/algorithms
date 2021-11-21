package source;

public class MergeSort {
    public static void mergeSort(int[] toSort, int p , int r){
        System.out.println();
        if(p < r){
            int q = (p+r)/2;
            for(int i = 0 ; i < toSort.length ; i++){
                System.out.print(String.format(" %d ",toSort[i]));
            }
            System.out.print(String.format("p:%d q:%d r:%d",p,q,r));
            mergeSort(toSort,p,q);
            mergeSort(toSort,q+1,r);
            merge(toSort,p,q,r);
        }
    }

    public static void  merge(int[] toSort, int p , int q , int r){
        int leftSize = q-p+1;
        int rightSize = r-q;

        int[] leftArray = new int[leftSize+1];
        int[] rightArray = new int[rightSize+1];

        for(int i = 0 ; i < leftSize ; i++){
            leftArray[i] = toSort[p+i];
        }
        for(int i = 0 ; i < rightSize ; i++){
            rightArray[i] = toSort[q+1+i];
        }
        leftArray[leftSize] = Integer.MAX_VALUE;
        rightArray[rightSize] = Integer.MAX_VALUE;

        int leftCounter = 0;
        int rightCounter = 0;
        for(int i = p ; i <= r ; i++){
            if(leftArray[leftCounter] < rightArray[rightCounter]){
                toSort[i] = leftArray[leftCounter];
                leftCounter++;
            }else{
                toSort[i] = rightArray[rightCounter];
                rightCounter++;
            }
        }
        System.out.println("After merge");
        for(int i = 0 ; i < toSort.length ; i++){
            System.out.print(String.format(" %d ",toSort[i]));
        }
        System.out.println();
    }
}

package source;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {
    private int[] merge1 = new int[]{5,6,7,10,12,20};
    private int[] merge1Result = new int[]{5,6,7,10,12,20};

    private int[] merge2 = new int[]{20,10,7,6,12,50};
    private int[] merge2Result = new int[]{6,7,10,12,20,50};

    @Test
    public void mergeTest(){
        MergeSort.merge(merge1,0,3,merge1.length-1);
        for(int i = 0 ; i < merge1.length ; i++){
            assertEquals(merge1Result[i],merge1[i]);
        }
    }

    @Test
    public void mergeSortTest(){
        MergeSort.mergeSort(merge2,0,merge2.length-1);
        for(int i = 0 ; i < merge2.length ; i++){
            assertEquals(merge2Result[i],merge2[i]);
        }
    }
}

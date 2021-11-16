package source;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsertionSortTest {
    private int[] test1 = new int[]{1,5,3,2,2,7,8};
    private int[] result1 = new int[]{1,2,2,3,5,7,8};

    private int[] test2 = new int[]{8,7,6,5,4,3,2,1};
    private int[] result2 = new int[]{1,2,3,4,5,6,7,8};

    private int[] test3 = new int[]{1,2,3,4,5,6,7,8};
    private int[] result3 = new int[]{1,2,3,4,5,6,7,8};

    private Student[] students = new Student[]{new Student(10), new Student(5), new Student(1),new Student(20)};
    private Student[] studentsResult = new Student[]{new Student(1), new Student(5), new Student(10),new Student(20)};


    @Test
    public void testInsertionSort(){
        InsertionSort.sort(test1);
        for(int i = 0 ; i < test1.length ; i++){
            assertEquals(result1[i],test1[i]);
        }
    }

    @Test
    public void testInsertionSort1(){
        InsertionSort.sort(test2);
        for(int i = 0 ; i < test2.length ; i++){
            assertEquals(result2[i],test2[i]);
        }
    }

    @Test
    public void testInsertionSort2(){
        InsertionSort.sort(test3);
        for(int i = 0 ; i < test3.length ; i++){
            assertEquals(result3[i],test3[i]);
        }
    }

    @Test
    public void testGenericsInsertionSort1(){
        InsertionSort.sort(students);
        for(int i = 0 ; i < students.length ; i++){
            assertTrue(studentsResult[i].equals(students[i]));
        }
    }
}

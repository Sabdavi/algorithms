package source;

public class Test {
    public static void main(String[] args) {
        int[] test1 = new int[]{1,5,3,2,2,7,8};
        InsertionSort.sort(test1);
        for(int i = 0 ; i < test1.length ; i++){
            System.out.println(test1[i]);
        }

        Student[] students = new Student[]{new Student(10), new Student(5), new Student(1),new Student(20)};
        InsertionSort.sort(students);
        for(int i = 0 ; i < students.length ; i++){
            System.out.println(students[i]);
        }
    }
}

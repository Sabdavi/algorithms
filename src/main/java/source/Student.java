package source;

public class Student implements Comparable<Student> {
    private int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public int compareTo(Student student) {
        if(this.id > student.id){
            return 1;
        }else if(this.id < student.id){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Student)){
            return false;
        }
        if(obj == null){
            return false;
        }
        Student other = (Student)obj;
        return this.getId() == other.id;
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return String.format("Student with ID : %d",getId());
    }
}

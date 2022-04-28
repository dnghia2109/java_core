import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String id;
    private String name;
    private String classroom;
    private float point;

    public Student(String id, String name, String classroom, float point) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.point = point;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", point=" + point +
                '}';
    }


    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}

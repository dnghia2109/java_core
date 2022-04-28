public class Student {
    private String id, name, address, classroom;
    private int age;
    private float point;

    public Student() {
    }

    public Student(String id, String name, String address, String classroom, int age, float point) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.classroom = classroom;
        this.age = age;
        this.point = point;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", address='" + address + '\'' +
                ", classroom='" + classroom + '\'' +
                ", age=" + age +
                ", point=" + point +
                '}';
    }
}

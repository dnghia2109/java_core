public class Student {
    private int id, age;
    private double point;
    private String name, address, classroom;

    public Student() {
    }

    public Student(int id, int age, double point, String name, String address, String classroom) {
        this.id = id;
        this.age = age;
        this.point = point;
        this.name = name;
        this.address = address;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", point=" + point +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}

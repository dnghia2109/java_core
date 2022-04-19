public class Student extends Person{
    private float point;

    public Student() {
    }

    public Student(int id, String name, String address, float point) {
        super(id, name, address);
        this.point = point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public void show() {

    }
}

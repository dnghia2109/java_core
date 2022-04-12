import java.time.LocalDate;

public class Teacher extends Person{
    private String subject;
    private float salary;

    public Teacher(int id, String name, LocalDate birthday, String gender, String address, String subject, float salary) {
        super(id, name, birthday, gender, address);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

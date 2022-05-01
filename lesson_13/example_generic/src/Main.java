import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonModel<Student> students = new PersonModel<>();
        students.add(new Student(1, "A", 20));
        students.add(new Student(2, "B", 21));
        students.display();

        PersonModel<Employee> employees = new PersonModel<>();
        employees.add(new Employee(1, "C", 22000000));
        employees.add(new Employee(2, "D", 23000000));
        employees.display();

        System.out.println(LocalDate.now());
    }
}

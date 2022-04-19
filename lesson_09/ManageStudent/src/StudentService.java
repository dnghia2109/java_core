import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student inputStudent(){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("- ID");
        student.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("- Tên:");
        student.setName(sc.nextLine());
        System.out.println("- Tuổi:");
        student.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("- Địa chỉ:");
        student.setAddress(sc.nextLine());
        System.out.println("- Điểm: ");
        student.setPoint(Double.parseDouble(sc.nextLine()));
        System.out.println("- Lớp:");
        student.setClassroom(sc.nextLine());

        return student;
    }

    public void showStudent(ArrayList<Student> list){
        for (Student student : list){
            System.out.println(student);
        }
    }

    //Cập nhật điểm
    public void updatePoint(ArrayList<Student> list, double updatePoint){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert new point:");
    }
}

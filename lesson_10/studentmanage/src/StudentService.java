import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentService {
    public Student inputStudent(){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("- ID:");
        student.setId(sc.nextLine());
        System.out.println("- Name:");
        student.setName(sc.nextLine());
        System.out.println("- Age:");
        student.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("- Address:");
        student.setAddress(sc.nextLine());
        System.out.println("- Point:");
        student.setPoint(Float.parseFloat(sc.nextLine()));
        System.out.println("- Classroom:");
        student.setClassroom(sc.nextLine());

        return student;
    }

    public void showAllStudent(ArrayList<Student> list){
        for (Student stu : list){
            System.out.println(stu);
        }
    }

    public void updatePointForStudent(Student student){
        Scanner sc = new Scanner(System.in);
        System.out.println("- Điểm cập nhật");
        float newPoint = Float.parseFloat(sc.nextLine());
        student.setPoint(newPoint);
    }

    public void deleteStudent(ArrayList<Student> list, Student student){
        list.remove(student);
    }

    public ArrayList<Student> showStudentInClass(ArrayList<Student> list){
        ArrayList<Student> newList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("- Nhập tên lớp muốn hiển thị danh sách sinh viên");
        String classroom = sc.nextLine();
        for (Student stu : list){
            if (stu.getClassroom().contains(classroom)){
                newList.add(stu);
            }
        }
        return newList;
    }

    public void sortByAge(ArrayList<Student> list){
        Coll
    }
}

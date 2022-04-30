import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class StudentService {
    public void showStudents(ArrayList<Student> list){
        for (Student student : list){
            System.out.println(student);
        }
    }

    // Nhập SV mới
    public Student addNewStudent(){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("- ID:");
        student.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("- Name:");
        student.setName(sc.nextLine());
        System.out.println("- Age:");
        student.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("- Address:");
        student.setAddress(sc.nextLine());
        System.out.println("- Point:");
        student.setPoint(Double.parseDouble(sc.nextLine()));
        System.out.println("- Classroom:");
        student.setClassroom(sc.nextLine());

        return student;

    }

    public Student findById(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("- Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Student s : list){
            if(s.getId() == id){
                student = s;
            }
        }
        return student;
    }



    // Cập nhật điểm
    public void updatePoint(Student student){
        Scanner sc = new Scanner(System.in);
        System.out.println("- Điểm cập nhật");
        double newPoint = Double.parseDouble(sc.nextLine());
        student.setPoint(newPoint);
    }

    // Xóa sinh viên
    public void deleteStudent(ArrayList<Student> list, Student student){
        list.remove(student);
    }

    // Danh sách SV theo lớp
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

    // Sắp xếp theo tên
    public void sortByName(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }

    // Sắp xếp theo tuổi
    public void sortByAge(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });
    }

    //Sắp xếp theo điểm
    public void sortByPoint(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getPoint() > o2.getPoint() ? 1 : -1;
            }
        });
    }
}

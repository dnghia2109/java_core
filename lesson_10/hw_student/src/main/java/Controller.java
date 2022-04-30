import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void menu(){
        System.out.println("1. Dánh sách tất cả các HS.");
        System.out.println("2. Thêm HS mới.");
        System.out.println("3. Cập nhập điểm học sinh.");
        System.out.println("4. Xóa học sinh.");
        System.out.println("5. Xem danh sách học sinh theo lớp");
        System.out.println("6. Sắp xếp theo tên.");
        System.out.println("7. Sắp xếp theo tuổi.");
        System.out.println("8. Sắp xếp theo điểm.");
        System.out.println("9. Thoát.");
    }

    public void mainController(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        StudentService service = new StudentService();
        Student newStudent = new Student();
        boolean flag = true;
        while (flag){
            menu();
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    service.showStudents(list);
                    break;
                case 2:
                    list.add(service.addNewStudent());
                    break;
                case 3:
                    newStudent = service.findById(list);
                    service.updatePoint(newStudent);
                    break;
                case 4:
                    newStudent = service.findById(list);
                    service.deleteStudent(list,newStudent);
                    break;
                case 5:
                    service.showStudentInClass(list);
                    break;
                case 6:
                    service.sortByName(list);
                    service.showStudents(list);
                    break;
                case 7:
                    service.sortByAge(list);
                    service.showStudents(list);
                    break;
                case 8:
                    service.sortByPoint(list);
                    service.showStudents(list);
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Chọn từ 1 - 9");
                    break;
            }
        }
    }

}

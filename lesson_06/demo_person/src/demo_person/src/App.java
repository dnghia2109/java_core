package demo_person.src;

import demo_person.src.model.Student;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();


        // Gọi tới phương thức nhập dữ liệu:
//        s1.insertStudent();
//        s2.insertStudent();

        // Gọi tới phương thức in dữ liệu:
//        s1.output();
//        s2.output();

//        System.out.println(s1);
//        System.out.println(s2);

        // Sừ dụng StudentService:
//        StudentService service = new StudentService();
//        Student s3 = service.createStudent();
//        System.out.println(s3);

        Student studentArray[] = new Student[3];
        Student s = new Student(1, "Nghĩa", 8,8);
        studentArray[0] = s;
        studentArray[1] = new Student(2, "NGHĨA", 9,9);
        studentArray[2] = new Student(3, "nghĩa", 9,9);

        for (int i = 0; i < studentArray.length; i++){
            System.out.println(studentArray[i]);
        }

        for (Student student : studentArray) {
            System.out.println(student);
        }

        // TÌM THEO TÊN:
        System.out.println("Tìm theo tên:");
        for (Student student : studentArray) {
            if (student.name.equalsIgnoreCase("Nghĩa")){
                System.out.println(student);
            }
        }

        System.out.println("");
    }
}

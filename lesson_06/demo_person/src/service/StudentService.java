package service;

import model.Student;

import java.util.Scanner;

// Class này sử dụng để xử lý các phương thức đối với student
public class StudentService {

    public Student createStudent(){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("Nhập id: ");
        s.id = Integer.parseInt(sc.nextLine()) ;
        System.out.println("Nhập tên: ");
        s.name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        s.theoryPoint = sc.nextDouble();
        System.out.println("Nhập điểm thực hành: ");
        s.practicalPoint = sc.nextDouble();

        return s;
    }

    // Tạo đối tượng với Constructor có tham số:
    public Student createNewStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine()) ;
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        double theoryPoint = sc.nextDouble();
        System.out.println("Nhập điểm thực hành: ");
        double practicalPoint = sc.nextDouble();

        Student s = new Student(id, name, theoryPoint, practicalPoint);

        return s;
    }


}

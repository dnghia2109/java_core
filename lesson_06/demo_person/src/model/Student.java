package demo_person.src.model;

import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public double theoryPoint, practicalPoint;
    public static String school = "Techmaster";

    public Student() {
    }

    public Student(int id, String name, double theoryPoint, double practicalPoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicalPoint = practicalPoint;
    }

    public void insertStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        this.id = Integer.parseInt(sc.nextLine()) ;
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        this.theoryPoint = sc.nextDouble();
        System.out.println("Nhập điểm thực hành: ");
        this.practicalPoint = sc.nextDouble();
    }

    public double avgPoint(){
        double avr = (this.theoryPoint + this.practicalPoint)/2;
        return avr;
    }

    public void output(){
        System.out.println("Mã sinh viên: " + this.id + "- Tên sinh viên: "+ this.name + " - Điểm lý thuyết: "
                + this.theoryPoint + " - Điểm thực hành: " + this.practicalPoint + " - Điểm trung bình: " + avgPoint());
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + this.id + "- Tên sinh viên: "+ this.name + " - Điểm lý thuyết: "
                + this.theoryPoint + " - Điểm thực hành: " + this.practicalPoint + " - Điểm trung bình: " + avgPoint();
    }
}

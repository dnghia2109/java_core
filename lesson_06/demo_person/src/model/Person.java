package demo_person.src.model;

import java.util.Scanner;

public class Person {
    // Tạo thuộc tính
    public String name;
    public String address;
    public int age;
    public static String school = "TechMaster";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student studentArray[] = new Student[n];
    }

    // Constructor mặc định:
    public Person(){
        System.out.println("Gọi tới Constructor mặc định.");
    }

    // Constructor có tham số:
    public Person(String ten, int tuoi, String diaChi){
        name = ten;
        age = tuoi;
        address = diaChi;
    }

    public void study(){
        System.out.println(name + " Gọi tới phương thức study()");
        // school = "Việt Nam";
    }

    public static void method(){
        System.out.println("Đây là phương thức static");
    }

    // Khối static sẽ đc gọi tới trc phương thức main khi hàm tạo đc gọi tới
    static {
        System.out.println("Đây là khối static.");
    }
}

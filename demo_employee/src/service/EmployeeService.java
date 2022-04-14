package service;


import model.Employee;
import model.Gender;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeService {
    public Employee inputEmployee(){
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.println("- Nhập id:");
        e.id = "NV" + sc.nextLine();

        System.out.println("- Nhập tên nhân viên:");
        e.name = sc.nextLine();

        System.out.println("- Nhập ngày tháng năm sinh: ");
        e.birthday = sc.nextLine();

        System.out.println("- Nhập giới tính: 1-MALE / 2-FEMALE");
        int choose = Integer.parseInt(sc.nextLine());
        boolean check = true;
        do {
            switch (choose){
                case 1:
                    e.gender = String.valueOf(Gender.MALE);
                    break;

                case 2:
                    e.gender = String.valueOf(Gender.FEMALE);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại 1-MALE / 2-FEMALE.");
                    check = false;
            }
        }while (check == false);

        while (true) {
            System.out.print("Mời bạn nhập số điện thoại: ");
            e.phone = sc.nextLine();
            String NUM_PATTERN = "0[0-9]{9,10}";
            if (Pattern.matches(NUM_PATTERN, e.phone)) {
                break;
            } else {
                System.out.println("Số điện thoại của bạn hợp lệ. Vui lòng nhập lại");
            }
        }

        while (true){
            System.out.print("Nhập vào email: ");
            e.email = sc.nextLine();
            String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
            if (Pattern.matches(EMAIL_PATTERN, e.email)){
                break;
            }else {
                System.out.println("Email của bạn không hợp lệ. Vui lòng nhập lại");
            }
        }

        System.out.println("Nhập địa chỉ");
        e.address = sc.nextLine();
        return e;
    }

    // Tìm kiếm theo id
    public void searchById(Employee[] arrEmp, String searchId){
        System.out.println("Nhân viên có id là \"" + searchId + "\" :");
        for (Employee i : arrEmp){
            if(i.id.contains(searchId)){
                System.out.println(i);
            }
        }
    }

    // Tìm kiếm theo tên
    public void searchByName(Employee[] arrEmp, String searchName){
        System.out.println("Nhân viên có tên là \"" + searchName + "\" :");
        for (Employee i : arrEmp){
            if(i.name.contains(searchName)){
                System.out.println(i);
            }
        }
    }

    // Lọc ra nhân viên nam
    public void searchByGenderMale(Employee[] arrEmp){
//        System.out.println("Nhân viên có giới tính MALE :");
        for (Employee i : arrEmp){
            String gender = "MALE";
            if(i.gender.equals(gender)){
                System.out.println(i);
            }
        }
    }

    // Lọc ra nhân viên nữ
    public void searchByGenderFemale(Employee[] arrEmp){
//        System.out.println("Nhân viên có giới tính FEMALE :");
        for (Employee i : arrEmp){
            String gender = "FEMALE";
            if(i.gender.equals(gender)){
                System.out.println(i);
            }
        }
    }


    // Tìm nhân viên ở Hà Nội
    public void searchAddressInHaNoi(Employee[] arrEmp){
//        System.out.println("Nhân viên có địa chỉ ở Hà Nội :");
        for (Employee i : arrEmp){
            if(i.address.contains("Hà Nội")){
                System.out.println(i);
            }
        }
    }


}

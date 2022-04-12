import java.util.Scanner;

public class ServiceEmployee {
    public Employee inputEmploy(){
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();

        System.out.println("Nhập id:");
        e1.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập tên:");
        e1.setName(sc.nextLine());
        System.out.println("Nhập birthday:");
        e1.setBirthday(sc.nextLine());
        System.out.println("Nhập địa chỉ:");
        e1.setAddress(sc.nextLine());
        System.out.println("Nhập email:");
        e1.setEmail(sc.nextLine());
        System.out.println("Nhập sđt:");
        e1.setMobile(sc.nextLine());
        return e1;
    }

    public void showEmploy(Employee[] arrEmp){
        System.out.println("Thông tin nhân viên:");
        for(Employee i : arrEmp){
            System.out.println(i);
        }
    }


}

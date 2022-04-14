import java.util.Scanner;

public class Main {
    public static void controller(){
        System.out.println("1. Tìm nhân viên theo ID.");
        System.out.println("2. Tìm nhân viên theo tên.");
        System.out.println("3. Tìm nhân viên theo giới tính.");
        System.out.println("4. Tìm nhân viên có địa chỉ ở Hà Nội.");
        System.out.println("5. Thoát.");
    }

    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhân viên muốn thêm: ");
        int n =  Integer.parseInt(sc.nextLine());
        Employee arrEmp[] = new Employee[n];
        EmployeeService service = new EmployeeService();
        for (int i = 0; i < n; i++) {
            System.out.println("NHÂN VIÊN THỨ " + (i+1) + " ");
            arrEmp[i] = service.inputEmployee();
        }

        do {
            controller();
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    System.out.println("- Nhập ID nhân viên muốn tìm:");
                    String searchId = sc.nextLine();
                    service.searchById(arrEmp, searchId);
                    break;

                case 2:
                    System.out.println("- Nhập tên nhân viên muốn tìm:");
                    String searchName = sc.nextLine();
                    service.searchByName(arrEmp, searchName);
                    break;

                case 3:
                    System.out.println("- Nhân viên có giới tính nam:");
                    service.searchByGenderMale(arrEmp);
                    System.out.println("- Nhân viên có giới tính nữ:");
                    service.searchByGenderFemale(arrEmp);
                    break;

                case 4:
                    System.out.println("- Nhân viên có địa chỉ ở Hà Nội:");
                    service.searchAddressInHaNoi(arrEmp);
                    break;

                case 5:
                    check  = false;
                    break;

                default:
                    System.out.println("Chọn yêu cầu từ 1-5");
                    break;
            }
        }while (check);
    }
}

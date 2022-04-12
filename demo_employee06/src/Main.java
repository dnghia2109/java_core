import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhân viên muốn thêm: ");
        int n =  Integer.parseInt(sc.nextLine());
        Employee arrEmp[] = new Employee[n];
        ServiceEmployee service = new ServiceEmployee();

        for (int i = 0; i < n; i++){
            System.out.println("NHÂN VIÊN THỨ " + (i+1) + " ");
            arrEmp[i] = service.inputEmploy();
        }

       service.showEmploy(arrEmp);
    }
}

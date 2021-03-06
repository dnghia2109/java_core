import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void mainMenu(){
        System.out.println("====== Main menu ======");
        System.out.println("1. Đăng nhập.");
        System.out.println("2. Đăng ký.");
        System.out.println("3. Thoát");
    }

    public static void signInCompleteMenu(){
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("5 - Thoát");
    }

    public static void forgetPasswordMenu(){
        System.out.println("1. Đăng nhập lại.");
        System.out.println("2. Quên mật khẩu.");
        System.out.println("3. Thoát.");
    }

    public void mainController(){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        ArrayList<User> listUser = new ArrayList<>();
        UserService service = new UserService();

        do {
            mainMenu();
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    service.signIn(listUser);
                    break;
                case 2:
                    listUser.add(service.createNewUser());
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.out.println("Chọn 1-3.");
                    break;
            }
        } while (check);

    }
}



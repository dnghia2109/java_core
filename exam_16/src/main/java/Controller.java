import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public void menuSignIn(){
        System.out.println("======= Chọn các chức năng sau =======");
        System.out.println("1. Đăng nhập.");
        System.out.println("2. Thoát.");
    }

    public static void menuInternetBankingService(){
        System.out.println("Đăng nhập thành công \n ====== Bạn có thể thực hiện các chức năng sau ======");
        System.out.println("1. Số dư tài khoản.");
        System.out.println("2. Chuyển tiền.");
        System.out.println("3. Lịch sử giao dịch.");
        System.out.println("4. Thoát.");
    }
    public void mainController(){
        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();
        ArrayList<User> listUser = service.listAccount();
        boolean flag = true;
        while(flag) {
            menuSignIn();
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    service.signIn(listUser);
                    break;
                case 2:
                    flag = false;
                    break;
                default:
                    System.out.println("Chọn 1 - 2 ");
                    break;
            }
        }

    }

    public static void internetBankingService(User user){
        InternetBankingService service2 = new InternetBankingService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            menuInternetBankingService();
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    service2.showBalance(user);
                    break;
                case 2:
                    service2.transferMoney(user);
                    break;
                case 3:
                    service2.showTransactionDetail(user.getTransactionDetail());
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Chọn 1 - 4");
                    break;
            }
        }
    }
}

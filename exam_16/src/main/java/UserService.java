import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserService {
    public ArrayList<User> listAccount(){
        ArrayList<User> newList = new ArrayList<>();
        newList.add(new User("0368105697", "21092001", 5000000));
        newList.add(new User("0368106697", "21092001", 5000000));
        newList.add(new User("0368107697", "21092001", 5000000));
        newList.add(new User("0368108697", "21092001", 5000000));
        newList.add(new User("0368109697", "21092001", 5000000));
        newList.add(new User("0368100697", "21092001", 5000000));

        return newList;
    }

//    public void signIn(){
//
//    }

    // Check phoneNumber (Username)
    public void signIn(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        User newUser = new User();
        String regexPhone = "^[0-9]{10}$";
        while (flag){
            System.out.println("- Nhập SĐT: ");
            String inputPhoneNumber = sc.nextLine();
            if (Pattern.matches(regexPhone, inputPhoneNumber)) {
                for (User user : list){
                    if (user.getPhoneNumber().equals(inputPhoneNumber)){
                        newUser = user;
                        checkPassword(newUser);
                        flag = false;
                    }else {
                        System.out.println("Kiểm tra lại SĐT.");
                    }
                }
            }else {
                System.out.println("Nhập đúng định dạng SĐT.");
            }
        }
    }

    // Check password
    public static void checkPassword( User user){
        Scanner sc = new Scanner(System.in);
        boolean  flag = true;
        String regexPassword = "^[0-9]{7,15}$";
        while (flag) {
            System.out.println("- Nhập password:");
            String inputPassword = sc.nextLine();
            if (Pattern.matches(regexPassword, inputPassword)) {
                if (user.getPassword().equals(inputPassword)){
                    System.out.println("- Đăng nhập thành công.");
                    Controller.internetBankingService(user);
                    flag = false;
                }else {
                    System.out.println("Vui lòng nhập lại password");
                }
            }else {
                System.out.println("Nhập password sai định dạng. Vui lòng nhập lại password.");
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserService {

    public void signIn(ArrayList<User> userArrayList){
        Scanner sc = new Scanner(System.in);
        boolean flag = true, check = true;
        User newUser = new User();
        do {
            System.out.println("- Username:");
            String checkUsername = sc.nextLine();
            for (User user1 : userArrayList){
                if (user1.getUserName().equals(checkUsername)){
                    newUser = user1;
                    flag = false;
                }else {
                    System.out.println("Kiểm tra lại Username.");
                }
            }
        }while (flag);

        System.out.println("- Password:");
        String checkPassword = sc.nextLine();
        do {
            if (newUser.getPassword().equals(checkPassword)){
                System.out.println("Chào mừng " + newUser.getUserName() + ", bạn có thể thực hiện" + " các công việc sau:");
                signInComplete(userArrayList, newUser);
                check = false;
            }else {
                int option = Integer.parseInt(sc.nextLine());
                switch (option){
                    case 1:
                        signIn(userArrayList);
                        break;
                    case 2:
                        forgotPass(newUser);
                        check = false;
                        break;
                }
            }
        }while (check);
    }


    // Quên mật khẩu
    public static void forgotPass(User user){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("- Email: ");
            String fEmail = sc.nextLine();
            if(user.getEmail().equals(fEmail)){
                checkNewPassword(user);// nhập mk mới
                flag = false;
            } else {
                System.out.println("Không tồn tại tài khoản.");
            }
        }while (flag);
    }


    // Ktra username khi đăng nhập
    public User checkUserNameSignIn(ArrayList<User> userArrayList){
        User user =  new User();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("- Username:");
            String checkUsername = sc.nextLine();
            for (User user1 : userArrayList){
                if (user1.getUserName().equals(checkUsername)){
                    user = user1;
                    flag  = false;
                }
            }
        }while (flag);

        return user;
    }

    // Ktra password khi đăng nhập
    public static void checkPasswordSignIn(ArrayList<User> userArrayList, User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("- Password:");
        String checkPassword = sc.nextLine();
        boolean flag = true, check = true;
        do {
            if (user.getPassword().equals(checkPassword)){
                System.out.println("Chào mừng " + user.getUserName() + ", bạn có thể thực hiện các công việc sau:");
                signInComplete(userArrayList, user);
                flag = false;
            }else {

            }
        }while (flag);

    }

    // Đăng nhập thành công
    public static void signInComplete(ArrayList<User> userArrayList, User user){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            Controller.signInCompleteMenu();
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    checkNewUserName(userArrayList, user);
                    break;
                case 2:
                    checkNewEmail(userArrayList, user);
                    break;
                case 3:
                    checkNewPassword( user);
                    break;
                case 4:
                    flag = false;
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Chọn từ 1-3.");
                    break;
            }
        }while (flag);
    }

    // Đăng ký
    public User createNewUser(ArrayList<User> list){
        User user = new User();
        checkNewUserName(list, user);
        checkNewEmail(list, user);
        checkNewPassword(user);
        list.add(user);
        return user;
    }


    // Check username khi đăng ký + Thay đổi username
    public static void checkNewUserName(ArrayList<User> userArrayList, User user){
        Scanner sc = new Scanner(System.in);
        boolean  flag = false;
        do {
            System.out.println("- Nhập Username:");
            String checkUserName = sc.nextLine();
            if (userArrayList.size() > 0){
                for (User user1 : userArrayList){
                    if (user1.getUserName().equals(checkUserName)){
                        System.out.println("Username đã tồn tại! Vui lòng sử dụng Username khác.");
                        flag = true;
                    }else {
                        user.setUserName(checkUserName);
                        flag = false;
                    }
                }
            }else {
                user.setUserName(checkUserName);
                flag = false;
            }
        }while (flag);
    }


    // Check Email khi đăng ký + Thay đổi email
    public static void checkNewEmail(ArrayList<User> userArrayList, User user) {
        Scanner sc = new Scanner(System.in);
        String regexEmail = "^[a-zA-Z][\\\\w-]+@([\\\\w]+\\\\.[\\\\w]+|[\\\\w]+\\\\.[\\\\w]{2,}\\\\.[\\\\w]{2,})$";
        boolean flag = false;
        String checkEmail = "";
        do {
            System.out.println("- Nhập email:");
            checkEmail = sc.nextLine();
            if (Pattern.matches(regexEmail, checkEmail)) {
                if (userArrayList.size() > 0) {
                    for (User user1 : userArrayList) {
                        if (user1.getEmail().equals(checkEmail)) {
                            System.out.println("Email đã tổồn tại! Vui lòng sử dụng Email khác.");
                            flag = true;
                            break;
                        } else {
                            user.setEmail(checkEmail);
                            flag = false;
                        }
                    }
                } else {
                    user.setEmail(checkEmail);
                    flag = false;
                }
            } else {
                System.out.println("Nhập email đúng định dạng");
                flag = true;
            }
        } while (flag);
    }


    // Check password khi đăng ký +Thay đổi password
    public static void checkNewPassword( User user){
        Scanner sc = new Scanner(System.in);
        boolean  flag = false;
        do {
            System.out.println("- Nhập password:");
            String regexPassword = "^(?=.*[a-zA-Z])(?=.*[\\.\\,\\(\\_]).{7,15}$";
            String checkPassword = sc.nextLine();
            if (Pattern.matches(regexPassword, checkPassword)){
                user.setPassword(checkPassword);
                flag =  false;
            }else {
                System.out.println("Nhập password đúng định dạng dài từ 7 " +
                        "đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt");
                flag = true;
                break;
            }
        }while (flag);

    }








//    public void updateUsername(User user){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("- Nhập username cập nhật mới:");
//        String updateUsername = sc.nextLine();
//        user.setUserName(updateUsername);
//    }
//
//    public void updateEmail(User user){
//        Scanner sc = new Scanner(System.in);
//        boolean  flag = false;
//        System.out.println("- Nhập email cập nhật mới:");
//        String updateEmail = sc.nextLine();
//        String regexEmail = "^[a-zA-Z][\\\\w-]+@([\\\\w]+\\\\.[\\\\w]+|[\\\\w]+\\\\.[\\\\w]{2,}\\\\.[\\\\w]{2,})$";
//        if (Pattern.matches(regexEmail, updateEmail)){
//            user.setEmail(updateEmail);
//            flag = false;
//        }else {
//            System.out.println("Nhập email đúng định dạng.");
//        }
//    }
//
//    public void updatePassword(User user){
//        boolean flag = true;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("- Nhập password cập nhật mới:");
//        String updatePassword = sc.nextLine();
//        String regexPassword = "";
//        if (Pattern.matches(regexPassword, updatePassword)){
//            user.setPassword(updatePassword);
//            flag = false;
//        }else {
//            System.out.println("Nhập mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt");
//        }
//    }
}

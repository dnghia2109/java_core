import java.util.Scanner;
import java.util.regex.Pattern;
public class Ex06 {
    public static void main(String[] args) {
        String email = inputEmail();
        String number = inputNumber();
    }

    public static String inputEmail() {
        Scanner sc = new Scanner(System.in);
        String email = "";
        while (true){
            System.out.print("Nhập vào email: ");
            email = sc.nextLine();
            String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
            if (Pattern.matches(EMAIL_PATTERN, email)){
                System.out.println("Email của bạn hợp lệ.");
                break;
            }else {
                System.out.println("Email của bạn không hợp lệ. Vui lòng nhập lại");
            }
        }
        return email;
    }

    public static String inputNumber() {
        Scanner sc = new Scanner(System.in);
        String num = "";
        while (true) {
            System.out.print("Mời bạn nhập số điện thoại: ");
            num = sc.nextLine();
            String NUM_PATTERN = "0[0-9]{9,10}";
            if (Pattern.matches(NUM_PATTERN, num)) {
                System.out.println("Số điện thoại của bạn hợp lệ.");
                break;
            } else {
                System.err.println("Số điện thoại của bạn hợp lệ. Vui lòng nhập lại");
            }
        }
        return num;
    }
}




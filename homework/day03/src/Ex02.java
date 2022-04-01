import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi muốn kiểm tra: ");
        var str = sc.nextLine();
        var str1 = "";
        for (int i = str.length() -1 ; i >= 0; i--){
            str1 += str.charAt(i);
        }
        System.out.println("Chuỗi sau khi đảo ngược: " + str1);
        if (str.equals(str1)){
            System.out.println("Đây là chuỗi palindrome");
        }else {
            System.out.println("Đây không phải là chuỗi palindrome");
        }
    }
}

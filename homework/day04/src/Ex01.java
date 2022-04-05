import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        String name = createName();
        showName(name);
    }

    public static String createName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] Name = str.split(" ");
        str = "";
        for(int i = 0; i < Name.length; i++){
            str += String.valueOf(Name[i].charAt(0)).toUpperCase() + Name[i].substring(1) + " ";
        }
        System.out.println();
        return str;
    }

    public static void showName(String abc){
        System.out.println("Tên của bạn sau khi được chuẩn hóa:\n " + abc);
    }

}

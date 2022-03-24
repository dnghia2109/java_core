import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Tên sau khi nhập: " + name);

        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Tuổi của bạn: " + age);

        System.out.println("Nhập điểm: ");
        // Trôi lệnh xảy ra khi nhập số rồi nhập chữ
//        Xử lí trôi lệnh
        double point = sc.nextDouble();
        sc.nextLine();

//        double point = Double.parseDouble(sc.nextLine());
        System.out.println("Điểm của bạn: " + point);

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Địa chỉ của bạn: " + address);

//       Tính chỉ số BMI
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();
        System.out.println("Chỉ số BMI: " + (weight/Math.pow(height, 2)));
    }
}

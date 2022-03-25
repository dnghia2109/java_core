import java.time.LocalDate;
import java.util.Scanner;

public class hw02 {
    public static void main(String[] args) {
        System.out.println("Chu vi và Diện tích hình chứ nhật");
        Scanner sc = new Scanner(System.in);
//        double length, width;
        System.out.println("Nhập chiều dài và chiều rộng của hình chữ nhật: ");
//        length = sc.nextDouble();
//        width = sc.nextDouble();
        double length = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        System.out.printf("Chu vi hình chữ nhật: %.2f",(length+width)*2);
        System.out.printf("\nDiện tích hình chữ nhật: %.2f\n",length*width);


        System.out.println("Giới thiệu bản thân gồm các thông tin họ tên, tuổi, giới tính, địa chỉ");
//        String name, birthday, gender, add;
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập năm sinh: ");
        int birthday = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("Tên tôi là " + name + ", năm nay tôi " + (LocalDate.now().getYear() - birthday) + ", giới tính " + gender + ", hiện tôi đang sống ở: " + address);

    }
}

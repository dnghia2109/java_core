import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Câu 1.1: In ra màn hình hình vuông * ");
        System.out.println("Nhập kích thước hình vuông:");
        int size = sc.nextInt();
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("Câu 1.2: In ra màn hình tam giác * ");
        System.out.println("Chiều cao của tam giác: ");
        int height = sc.nextInt();
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}

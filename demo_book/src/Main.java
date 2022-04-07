import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sách muốn thêm: ");
        int n = sc.nextInt();
        Book arrBook[] = new Book[n];

        for (int i = 0; i < arrBook.length; i++){
            arrBook[i].inputBook();
        }
    }
}


import Service.BookService;
import model.Book;

import java.util.Scanner;

public class Main {

    public static void controller(){
        System.out.println("1. Tìm sách theo tên.");
        System.out.println("2. Tìm sách theo thể loại.");
        System.out.println("3. Tìm sách xuất bản trong năm nay.");
        System.out.println("4. Thoát");
    }

    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sách muốn thêm: ");
        int n =  Integer.parseInt(sc.nextLine());
        Book arrBook[] = new Book[n];
        BookService service = new BookService();

        for (int i = 0; i < n; i++) {
            System.out.println("SÁCH THỨ " + (i+1) + " ");
            arrBook[i] = service.inputBook();
        }

        service.showBook(arrBook);

        do {
            controller();
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Nhập tên sách muốn tìm: ");
                    String title = sc.nextLine();
                    service.findByTitle(arrBook, title);
                    break;

                case 2:
                    System.out.println("Nhập thể loại sách muốn tìm: ");
                    String cate = sc.nextLine();
                    service.findByCate(arrBook, cate);
                    break;

                case 3:
                    System.out.println("Sách xuất bản trong năm nay:");
                    service.findByCurrentYear(arrBook);
                    break;

                case 4:
                    check = false;
//                    break;

                default:
                    System.out.println("Chọn yêu cầu từ 1-3");
                    break;
            }
        } while (check) ;

//        System.out.println("Nhập tên sách muốn tìm: ");
//        String title = sc.nextLine();
//        service.findBookByTitle(arrBook, title);
//
//        System.out.println("Nhập thể loại sách muốn tìm: ");
//        String cate = sc.nextLine();
//        service.findBookByCate(arrBook, cate);
//
//        service.findBookByYear(arrBook);

//
    }
}

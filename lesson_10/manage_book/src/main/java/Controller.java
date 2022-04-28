import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public void menu(){
        System.out.println("1. Danh sách tất cả các sách.");
        System.out.println("2. Tìm sách theo tên.");
        System.out.println("3. Tìm sách theo thể loại.");
        System.out.println("4. Sắp xếp sách theo số trang");
        System.out.println("5. Sắp xếp sách theo năm xuất bản.");
        System.out.println("6. Thoát.");;
    }

    public void mainController(){
        Scanner sc = new Scanner(System.in);
        ServiceBook service = new ServiceBook();
        ArrayList<Book> list = service.getListBook();
        boolean flag = true;
        while (flag){
            menu();
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    service.showBook(list);
                    break;
                case 2:
                    ArrayList<Book> listFindBookByTitle = service.searchBookByTitle(list);
                    service.showBook(listFindBookByTitle);
                    break;
                case 3:
                    ArrayList<Book> listFindBookByCategory = service.searchBookByCategory(list);
                    service.showBook(listFindBookByCategory);
                    break;
                case 4:
                    service.sortByPageNumber(list);
                    service.showBook(list);
                    break;
                case 5:
                    service.sortByReleaseYear(list);
                    service.showBook(list);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Chọn từ 1-6.");
                    break;
            }
        }

    }

}

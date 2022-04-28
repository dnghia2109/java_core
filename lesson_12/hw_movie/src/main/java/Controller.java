import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void menu(){
        System.out.println("1. Dánh sách tất cả các phim.");
        System.out.println("2. Sắp xếp phim theo tên.");
        System.out.println("3. Sắp xếp phim theo thời lượng");
        System.out.println("4. Sắp xếp phim theo lượt xem");
        System.out.println("5. Đếm mỗi thể loại có bao nhiêu bộ phim");
        System.out.println("6. Thoát.");
    }

    public void mainController(){
        Scanner sc = new Scanner(System.in);
        MovieService service = new MovieService();
        ArrayList<Movie> list = service.getListMovie();
        boolean flag = true;
        while (flag){
            menu();
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    service.showMovie(list);
                    break;
                case 2:
                    service.sortByTitle(list);
                    service.showMovie(list);
                    break;
                case 3:
                    service.sortByLength(list);
                    service.showMovie(list);
                    break;
                case 4:
                    service.sortByView(list);
                    service.showMovie(list);
                    break;
                case 5:
                    service.quantityMovieByCategory(list);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Chọn từ 1 - 6.");
                    break;
            }
        }
    }
}

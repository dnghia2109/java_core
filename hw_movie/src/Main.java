import model.Movie;
import model.Serial;
import service.MovieService;
import service.SerialService;

import java.util.Scanner;

public class Main {
    public static void controller(){
        System.out.println("1. Danh sách các phim. ");
        System.out.println("2. Tìm kiếm theo tên.");
        System.out.println("3. Thoát.");
    }

    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng phim lẻ: ");
        int m = sc.nextInt();
        Movie arrMovie[] = new Movie[m];
        MovieService serviceMovie = new MovieService();
        for (int i = 0; i < m; i++) {
            System.out.println("PHIM LẺ THỨ " + (i+1) + " ");
            arrMovie[i] = serviceMovie.inputMovie();
        }

        System.out.println("Nhập số lượng phim dài tập:");
        int s = sc.nextInt();
        Serial arrSerial[] = new Serial[s];
        SerialService serviceSerial = new SerialService();
        for (int i = 0; i < s; i++) {
            System.out.println("PHIM DÀI TẬP THỨ " + (i+1) + " ");
            arrSerial[i] = serviceSerial.inputSerial();
        }

        do {
            controller();
            int option = sc.nextInt();
            sc.nextLine();
//            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    System.out.println("======= Tất cả các phim lẻ hiện có: =======");
                    serviceMovie.showMovie(arrMovie);
                    System.out.println("======= Tất cả các phim dài tập hiện có: =======");
                    serviceSerial.showSerial(arrSerial);
                    break;

                case 2:
                    System.out.println("Nhập tên phim muốn tìm:");
                    String filmTitle = sc.nextLine();
                    serviceMovie.searchByName(arrMovie, filmTitle);
                    serviceSerial.getSerialByName(arrSerial, filmTitle);

                case 3:
                    check = false;
//                    break;

                default:
                    System.out.println("Chọn yêu cầu từ 1-3");
                    break;
            }
        }while (check);
    }
}

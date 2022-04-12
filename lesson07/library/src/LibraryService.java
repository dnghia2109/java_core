import model.Library;

import java.util.Scanner;

public class LibraryService {
    public Library inputLibrary(){
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        System.out.println("Nhập id:");
        library.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhâp tên sách:");
        library.setName(sc.nextLine());
        System.out.println("Nhập nhà xuất bản:");

    }
}

// Viết chương trình quản lý sách với các thông tin sau: id, title, description, author, category, publishingYear
// Thực hiện các công việc: thêm sách mới, in sách ra màn hình.

import java.util.Scanner;

public class Book {
    public int id, publishingYear;
    public String title, description, author, category;

    public void inputBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sách: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sách: ");
        title = sc.nextLine();
        System.out.println("Nhập mô tả: ");
        description = sc.nextLine();
        System.out.println("Nhập thể loại của sách: ");
        category = sc.nextLine();
        System.out.println("Nhập tác giả:");
        author = sc.nextLine();
        System.out.println("Nhập năm phát hành: ");
        publishingYear = sc.nextInt();

    }

    public void showBook(){
        System.out.println("ID sách: " + id + " - Tên sách: " + title + " - Mô tả: " + description +
                " - Thể loại: " + category + " - Tác giả: " + author + " - Năm xuất bản: " + publishingYear);
    }
}

package model;
// Viết chương trình quản lý sách với các thông tin sau: id, title, description, author, category, publishingYear
// Thực hiện các công việc: thêm sách mới, in sách ra màn hình.

import java.util.Scanner;

public class Book {
    public int id, publishingYear;
    public String title, description, author, category;

    public String toString() {
        return "ID sách: " + id + " - Tên sách: " + title + " - Mô tả: " + description +
                " - Thể loại: " + category + " - Tác giả: " + author + " - Năm xuất bản: " + publishingYear;
    }
//    public void showBook(){
//        System.out.println("ID sách: " + id + " - Tên sách: " + title + " - Mô tả: " + description +
//                " - Thể loại: " + category + " - Tác giả: " + author + " - Năm xuất bản: " + publishingYear);
//    }
}

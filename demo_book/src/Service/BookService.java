package Service;


import model.Book;

import java.time.LocalDate;
import java.util.Scanner;

public class BookService {
    public Book inputBook(){
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Nhập id sách: ");
        book.id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sách: ");
        book.title = sc.nextLine();
        System.out.println("Nhập mô tả: ");
        book.description = sc.nextLine();
        System.out.println("Nhập thể loại của sách: ");
        book.category = sc.nextLine();
        System.out.println("Nhập tác giả:");
        book.author = sc.nextLine();
        System.out.println("Nhập năm phát hành: ");
        book.publishingYear = sc.nextInt();

        return book;
    }

    // In thông tin các sách
    public void showBook(Book[] arrBook){
        System.out.println("Thông tin sách:");
        for(Book i : arrBook){
            System.out.println(i);
        }
    }

    // Tìm theo tên sách
    public void findByTitle(Book[] arrBook, String name){
        for(Book i : arrBook){
            if (i.title.contains(name)){
                System.out.println(i);
            }
        }
    }

    // Tìm theo danh mục (thể loại)
    public void findByCate(Book[] arrBook, String cate){
        for(Book i : arrBook){
            if (i.category.contains(cate)){
                System.out.println(i);
            }
        }
    }

    // Danh sách sách có năm phát hành là năm nay
    public void findByCurrentYear(Book[] arrBook){
        for(Book i : arrBook){
            if (i.publishingYear == LocalDate.now().getYear()){
                System.out.println(i);
            }
        }
    }


}

import model.SchoolBook;

import java.util.Scanner;

public class SchoolBookService {
    public SchoolBook createchoolBook(){
        Scanner sc = new Scanner(System.in);
        SchoolBook s = new SchoolBook();
        System.out.println("ID: ");
        s.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Tên sách: ");
        s.setName(sc.nextLine());
        System.out.println("Nhà xuất bản: ");
        s.setAuthor(sc.nextLine());
        System.out.println("Năm xuất bản: ");
        s.setPublishingYear(sc.nextLine());
        System.out.println("Số lượng: ");
        s.setQuantity(Integer.parseInt(sc.nextLine()));
        System.out.println("Tình trạng: ");
        s.setStatus(sc.nextLine());
        System.out.println("Số lượng mượn:");
        s.setBorrow(Integer.parseInt(sc.nextLine()));
        return s;
    }

    public int tonKho(int quantity, int borrow){
        return quantity - borrow;
    }

    public void show(SchoolBook schoolBook){
        System.out.println(schoolBook.getId() + " - " + schoolBook.getName() + tonKho(schoolBook.getQuantity(), schoolBook.getBorrow()));
    }
}

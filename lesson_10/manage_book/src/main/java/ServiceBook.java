import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServiceBook {
    Scanner sc = new Scanner(System.in);

    // Chuyển từ json sang ArrayList
    public ArrayList<Book> getListBook(){
        Gson gson = new Gson();
        ArrayList<Book> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader("book.json");
            Type type = new TypeToken<ArrayList<Book>>(){}.getType();
            list = gson.fromJson(reader, type);
        }catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file.");
        }

        return list;
    }

    public void showBook(ArrayList<Book> list){
        for (Book book : list){
            System.out.println(book);
        }
    }

    // Tìm sách theo tên
    public ArrayList<Book> searchBookByTitle(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("- Tên sách muốn tìm: ");
        String title = sc.nextLine();
        ArrayList<Book> newList = new ArrayList<>();
        for (Book book : list){
            if (book.getTitle().contains(title)){
                newList.add(book);
            }
        }

        return newList;
    }

    // Tìm sách theo thể loại
    public ArrayList<Book> searchBookByCategory(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("- Thể loại sách muốn tìm: ");
        String category = sc.nextLine();
        ArrayList<Book> newList = new ArrayList<>();
        for (Book book : list){
            if (book.getTitle().contains(category)){
                newList.add(book);
            }
        }

        return newList;
    }

    // Sắp xếp sách theo số trang ( tăng dần )
    public void sortByPageNumber(ArrayList<Book> list){
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage_number() > o2.getPage_number() ? 1 : -1;
            }
        });
    }

    // Sắp xếp sách thoe năm
    public void sortByReleaseYear(ArrayList<Book> list){
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getRelease_year() > o2.getPage_number() ? 1 : -1;
            }
        });
    }



}

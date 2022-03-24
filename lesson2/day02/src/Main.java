import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args){
//        Sử dụng String literal
        String name = "Nghia";
        String fullname = "nghia";
//        Sử dụng từ khóa new
        String address = new String( "Hà Nội");
        String city = new String( "Hà Nội");

//        Sử dụng literal sẽ tiết kiệm bộ nhớ hơn với vc khai báo bằng từ khóa new
        System.out.println("Tôi tên là: "+name);
        int size = name.length();
        System.out.println("Chuỗi: "+ name + " có độ dài: " +size);
        System.out.println("Độ dài của chuỗi " + address + " là: " + address.length());

        System.out.println("Viết in hoa: " + name.toUpperCase());
        System.out.println("Viết in thường: " + name.toLowerCase());

        System.out.println("So sánh 2 chuỗi: " + name.equals(address));
        String result = name.equals(address) ? "Hai chuỗi giống nhau" : "Hai chuỗi khác nhau";
        System.out.println("So sánh 2 chuỗi: " + result );

        System.out.println(address == city);
        System.out.println(address.equals(city));

        System.out.println("So sánh phân biệt in hoa in thường " +name.equals(fullname));
        System.out.println("So sánh không phân biệt in hoa in thường " + name.equals(fullname));

        String str = "   Java   ";
        System.out.println("Chuỗi ban dầu: " + str + "\nChuỗi sau khi loại bỏ khoảng trắng: " + str.trim());

        System.out.println("Thay chữ a thành chữ e: " + str.replace('a', 'e'));

        System.out.println("Kiểm tra trong chuỗi có chữ a hay không: " + str.contains("a"));

        String title = "Cuốn theo chiều gió";
        System.out.println("Ký tự u nằm ở index bao nhiêu: " + title.indexOf("u"));
        System.out.println("Ký tự u nằm ở index cuối cùng bao nhiêu: " + title.lastIndexOf("u"));
        System.out.println("Chữ ở vị trí index dầu tiên: " + title.charAt(0));

        System.out.println("Lấy ra chuỗi con: " + title.substring(10));
        System.out.println("Lấy ra chuỗi con: " + title.substring(10,15));

        String s = "nghĩa";
        String s1 = String.valueOf(s.charAt(0));
        System.out.println(s1.toUpperCase() + s.substring(1));


        Season muaDong = Season.WINTER;
        System.out.println(muaDong);

        Month thangHai = Month.FEBRUARY;
        System.out.println(thangHai);


    }
}

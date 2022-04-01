import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bạn muốn kiểm tra: \n");
        var st = sc.nextLine();
        char str2 = 'e';
        int count= 0;
        for (int i = 0; i < st.length(); i++){
            if (str2 == st.charAt(i)){
                count++;
                System.out.println("Vị trí xuất hiện kí tự \"e\": " + i);
            }
        }
        if(count != 0){
            System.out.println("Số lần xuất hiện kí tự \"e\" trong chuỗi: " + count);
        }else{
            System.out.println("Không có kí tự \"e\" trong chuỗi");
        }
    }
}

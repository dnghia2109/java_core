import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nCho chuỗi: You only live once, but if you do it right, once is enough");
        String st = "You only live once, but if you do it right, once is enough";

        String[] str = st.split(" ");
        System.out.println("\n Số từ có trong chuỗi: " + str.length + "\n");

        st = st.toLowerCase();
        char check = 'o';
        int count= 0;
        for (int i = 0; i < st.length(); i++){
            if (check == st.charAt(i)){
                count++;
                System.out.println(" Vị trí xuất hiện kí tự \"o\": " + (i+1));
            }
        }
        if(count != 0){
            System.out.println("\n Số lần xuất hiện kí tự \"o\" trong chuỗi: " + count);
        }else{
            System.out.println("\n Không có kí tự \"o\" trong chuỗi");
        }
    }
}

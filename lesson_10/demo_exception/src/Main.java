import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 5;
//        try {
//            int c = b/a;
//            System.out.println(c);
//        }catch (ArithmeticException e){
//            System.out.println("Bạn đang chia một số cho 0");
//        }
        //catch (Exception e)

//        System.out.println("done");
        Scanner sc = new Scanner(System.in);
//        boolean check = true;
//        while (check){
//            try {
//                System.out.println("Nhập tuổi:");
//                int age = Integer.parseInt(sc.nextLine());
//                System.out.println("Tuổi " + age);
//                check = false;
//            } catch (NumberFormatException e){
//                System.out.println("Nhập sai kiểu dữ liệu.");
//                System.out.println("Vui lòng nhập lại.");
//            }finally {
//                System.out.println("Khối này luôn đc thực thi");
//            }
//        }

        Bmi Bmi = new Bmi();
        System.out.println("Chỉ số BMI:");
        float bmi = Bmi.bmiCalculator();
        System.out.println(bmi);


//        int[] arr = new int[5];
//        arr[10] = 8;

//        boolean flag = true;
//        while (flag){
//            try {
//                System.out.println("Nhập số phần tử:");
//                int n = Integer.parseInt(sc.nextLine());
//                int[] arr = new int[n];
//            } catch (NumberFormatException e){
//                System.out.println("Nhập sai kiểu dữ liệu.");
////                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//            }catch (NegativeArraySizeException e){
//                System.out.println("Kích thước mảng k đc âm.");
//            }
//        }

    }
}

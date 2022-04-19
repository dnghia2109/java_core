import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi {

    public float bmiCalculator(){
        System.out.println("Nhập chiều cao, cân nặng:");
        float height = input();
        float weight = input();

        return weight/(height*height);
    }

    public float input(){
        Scanner sc = new Scanner(System.in);
        float number = 0;
        boolean flag = true;
        while (flag){
            try {
                number = Float.parseFloat(sc.nextLine());
                if (number <= 0){
                    throw new CustomException("DL phải lớn hơn 0");
                }
                flag = false;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai dữ liệu, vui lòng nhập lại.");
            }catch (CustomException e){
                System.out.println("Nhập sai dl.");
                System.out.println(e.getMessage());
            }
        }
        return number;
    }



}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = -10;
        if (age >= 18) {
            System.out.println("bạn đủ tuổi bầu cử");
            if (age > 150) {
                System.out.println("Bạn bất tử à");
            }
        } else { //age < 18
            System.out.println("Bạn chưa đủ tuổi bầu cử");
            if (age < 0) {
                System.out.println("Tuổi âm mất rồi");
            }
        }


//        BMI
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.println("Nhập cân năng: ");
        double weight = sc.nextDouble();
        double bmi = weight/(height*height);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi >= 18.5 && bmi < 24.9){
            System.out.println("Normal");
        }else if(bmi >= 24.9 && bmi < 29.9){
            System.out.println("Overweight");
        }else if(bmi >= 29.9 && bmi < 34.9){
            System.out.println("Obese");
        }else {
            System.out.println("Extremly Obese");
        }

//        SWITCH CASE
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Không có số này");
                break;
        }
    }
}
